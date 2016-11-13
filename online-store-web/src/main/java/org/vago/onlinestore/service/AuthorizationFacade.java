package org.vago.onlinestore.service;

import org.vago.onlinestore.dto.CredentialDto;
import org.vago.onlinestore.dto.FactoryDto;
import org.vago.onlinestore.dto.TokenDto;
import ru.vago.authorization.service.AuthorizationService;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

public class AuthorizationFacade
{
    private final AuthorizationService authorizationService;

    @Inject
    public AuthorizationFacade(@Nonnull final AuthorizationService authorizationService)
    {
        this.authorizationService = authorizationService;
    }

    @Nonnull
    public TokenDto authorization(@Nonnull final CredentialDto credential)
    {
        return FactoryDto.createToken(authorizationService.createToken(credential.getLogin(), credential.getPassword()));
    }

    @Nonnull
    public Response authorizationByToken(@Nonnull final TokenDto token)
    {
        boolean userExist = authorizationService.existToken(token.getToken());
        return userExist ? Response.status(400).build() : Response.status(401).build();
    }
}
