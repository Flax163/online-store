package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.ServerConstants;
import org.vago.onlinestore.dto.CredentialDto;
import org.vago.onlinestore.dto.TokenDto;

import javax.annotation.Nonnull;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.vago.onlinestore.ServerConstants.*;

@Path(ROOT_PATH_END_POINT)
public interface AuthorizationEndPoint
{
    @POST
    @Path(ServerConstants.ONLINE_STORE_PATH_AUTHORIZATION)
    @Produces(MediaType.APPLICATION_JSON)
    @Nonnull
    TokenDto authorization(@Nonnull CredentialDto credential);

    @POST
    @Path(ServerConstants.ONLINE_STORE_PATH_CHECK_TOKEN)
    @Produces(MediaType.APPLICATION_JSON)
    Response authorizationByToken(@Nonnull TokenDto token);
}
