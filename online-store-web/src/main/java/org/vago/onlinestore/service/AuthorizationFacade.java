package org.vago.onlinestore.service;

import org.vago.onlinestore.dto.CredentialDto;
import org.vago.onlinestore.dto.FactoryDto;
import org.vago.onlinestore.dto.TokenDto;
import ru.vago.authorization.service.AuthorizationService;

import javax.inject.Inject;

public class AuthorizationFacade
{
    private final AuthorizationService authorizationService;

    @Inject
    public AuthorizationFacade(final AuthorizationService authorizationService)
    {
        this.authorizationService = authorizationService;
    }

    public TokenDto authorization(CredentialDto credential)
    {
        return FactoryDto.createToken(authorizationService.createToken(credential.getLogin(), credential.getPassword()));
    }
}
