package ru.vago.authorization;

import ru.vago.authorization.entity.User;
import ru.vago.authorization.exception.UserNotFoundException;
import ru.vago.authorization.service.AuthorizationService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Stateless
public class AuthorizationServiceImpl implements AuthorizationService
{
    @PersistenceContext(unitName = "AuthorizationModule")
    private EntityManager entityManager;

    @Override
    public String createToken(final String login, final String password)
    {
        User existUser = entityManager.createQuery("SELECT u from User u WHERE u.login = :login AND u.password = :password", User.class)
                .setParameter("login", login)
                .setParameter("password", password)
                .getResultList()
                .stream()
                .findFirst()
                .orElseThrow(UserNotFoundException::new);
        String generateToken = String.valueOf(UUID.randomUUID());
        existUser.setToken(generateToken);
        entityManager.merge(existUser);
        return generateToken;
    }
}
