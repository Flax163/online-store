package ru.vago.authorization.service;

public interface AuthorizationService
{
    String createToken(String login, String password);
}
