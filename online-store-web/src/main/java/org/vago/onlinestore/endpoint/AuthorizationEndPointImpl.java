package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.dto.CredentialDto;
import org.vago.onlinestore.dto.TokenDto;
import org.vago.onlinestore.service.AuthorizationFacade;

import javax.inject.Inject;
import javax.ws.rs.NotSupportedException;

public class AuthorizationEndPointImpl implements AuthorizationEndPoint
{
    private AuthorizationFacade authorizationFacade;

    public AuthorizationEndPointImpl() {}

    @Inject
    public AuthorizationEndPointImpl(final AuthorizationFacade authorizationFacade)
    {
        this.authorizationFacade = authorizationFacade;
    }

    @Override
    public TokenDto authorization(CredentialDto credential)
    {
        return authorizationFacade.authorization(credential);
    }

    @Override
    public TokenDto changeToken(TokenDto token)
    {
        throw new NotSupportedException();
    }
}
