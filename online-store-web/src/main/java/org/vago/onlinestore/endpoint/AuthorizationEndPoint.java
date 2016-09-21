package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.ServerConstants;
import org.vago.onlinestore.dto.CredentialDto;
import org.vago.onlinestore.dto.TokenDto;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface AuthorizationEndPoint
{
    @POST
    @Path(ServerConstants.ONLINE_STORE_PATH_AUTHORIZATION)
    @Produces(MediaType.APPLICATION_JSON)
    TokenDto authorization(CredentialDto credential);

    @PUT
    @Path(ServerConstants.ONLINE_STORE_PATH_CHECK_TOKEN)
    @Produces(MediaType.APPLICATION_JSON)
    void authorization(TokenDto token);
}
