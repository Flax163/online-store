package org.vago.onlinestore.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/offers")
public interface OfferService
{
    /*@GET
    Offer getOffersByCategory(BigInteger idCategory);*/

    @GET
    String getOffers();
}
