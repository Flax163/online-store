package ru.vago.authorization.service;

import ru.vago.authorization.entity.User;
import ru.vago.authorization.service.AuthorizationService;

import javax.annotation.Nonnull;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Stateless
public class AuthorizationServiceImpl implements AuthorizationService
{
    @PersistenceContext(unitName = "AuthorizationModule")
    private EntityManager entityManager;

    @Nonnull
    @Override
    public String createToken(@Nonnull final String login,
                              @Nonnull final String password)
    {
        User existUser = entityManager.createQuery("SELECT u from User u WHERE u.login = :login AND u.password = :password", User.class)
                .setParameter("login", login)
                .setParameter("password", password)
                .getResultList()
                .stream()
                .findFirst()
                .orElseThrow(SecurityException::new);
        return createOrUpdateToken(existUser);
    }

    @Nonnull
    @Override
    public String updateToken(@Nonnull final String oldToken,
                              @Nonnull final String login,
                              @Nonnull final String password)
    {
        User existUser = entityManager.createQuery("SELECT u from User u WHERE u.login = :login AND u.password = :password AND u.token = :token", User.class)
                .setParameter("login", login)
                .setParameter("token", oldToken)
                .setParameter("password", password)
                .getResultList()
                .stream()
                .findFirst()
                .orElseThrow(SecurityException::new);
        return createOrUpdateToken(existUser);
    }

    @Override
    public boolean existToken(@Nonnull final String token)
    {
        return !entityManager.createQuery("SELECT u FROM User u WHERE u.token = :token", User.class)
                .setParameter("token", token)
                .getResultList()
                .isEmpty();
    }

    @Nonnull
    private String createOrUpdateToken(@Nonnull final User user)
    {
        String generateToken = String.valueOf(UUID.randomUUID());
        user.setToken(generateToken);
        entityManager.persist(user);
        return generateToken;
    }
}
