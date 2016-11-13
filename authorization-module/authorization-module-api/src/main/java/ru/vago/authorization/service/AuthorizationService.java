package ru.vago.authorization.service;

import javax.annotation.Nonnull;

public interface AuthorizationService
{
    @Nonnull
    String createToken(@Nonnull String login, @Nonnull String password);

    @Nonnull
    String updateToken(@Nonnull String oldToken, @Nonnull String login, @Nonnull String password);

    boolean existToken(@Nonnull String token);
}
