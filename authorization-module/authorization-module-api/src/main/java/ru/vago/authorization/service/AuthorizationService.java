package ru.vago.authorization.service;

import ru.vago.authorization.model.AuthorizationData;

public interface AuthorizationService
{
    boolean authorization(AuthorizationData authorizationData);
}
