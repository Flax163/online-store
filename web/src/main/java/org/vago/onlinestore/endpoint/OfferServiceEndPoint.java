package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.dto.OfferVO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.Collection;

import static org.vago.onlinestore.Constant.*;

@Path(END_POINT_PATH_ONLINE_STORE)
public interface OfferServiceEndPoint
{
    @GET
    @Path(LOAD_OFFERS_PATH_ONLINE_STORE)
    @Produces(MediaType.APPLICATION_JSON)
    Collection<OfferVO> loadOffers();

    @GET
    @Path(LOAD_OFFER_PATH_ONLINE_STORE)
    @Produces(MediaType.APPLICATION_JSON)
    OfferVO loadOffer(@PathParam("id") BigInteger id);
}
