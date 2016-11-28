package ru.vago.onlinestore.endpoint;

import ru.vago.onlinestore.dto.CredentialDto;
import ru.vago.onlinestore.dto.TokenDto;
import ru.vago.onlinestore.service.AuthorizationFacade;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

public class AuthorizationEndPointImpl implements AuthorizationEndPoint
{
    private AuthorizationFacade authorizationFacade;

    public AuthorizationEndPointImpl() {}

    @Inject
    public AuthorizationEndPointImpl(@Nonnull final AuthorizationFacade authorizationFacade)
    {
        this.authorizationFacade = authorizationFacade;
    }

    @Nonnull
    @Override
    public TokenDto authorization(@Nonnull final CredentialDto credential)
    {
        return authorizationFacade.authorization(credential);
    }

    @Override
    public Response authorizationByToken(@Nonnull final TokenDto token)
    {
        return authorizationFacade.authorizationByToken(token);
    }
}
