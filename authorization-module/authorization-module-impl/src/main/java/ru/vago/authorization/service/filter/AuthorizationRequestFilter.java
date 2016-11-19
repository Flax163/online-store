package ru.vago.authorization.service.filter;

import ru.vago.authorization.anotation.Secured;
import ru.vago.authorization.service.AuthorizationService;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Secured
public class AuthorizationRequestFilter implements ContainerRequestFilter
{
    private final AuthorizationService authorizationService;

    @Inject
    public AuthorizationRequestFilter(@Nonnull final AuthorizationService authorizationService)
    {
        this.authorizationService = authorizationService;
    }

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException
    {
        String authorizationHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader == null || !authorizationHeader.startsWith("Token ")) {
            throw new NotAuthorizedException("Authorization header must be provided");
        }
        String token = authorizationHeader.substring("Token".length()).trim();
        if (authorizationService.existToken(token))
        {
            requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }
}
