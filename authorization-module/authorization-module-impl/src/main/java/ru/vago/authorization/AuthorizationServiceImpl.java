package ru.vago.authorization;

import ru.vago.authorization.model.AuthorizationData;
import ru.vago.authorization.service.AuthorizationService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AuthorizationServiceImpl implements AuthorizationService
{
    @PersistenceContext(unitName = "AuthorizationModule")
    private EntityManager entityManager;

    @Override
    public boolean authorization(AuthorizationData authorizationData)
    {
        return false;
    }
}
