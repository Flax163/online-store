package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.List;

@Path("/offers")
public interface OfferServiceEndPoint
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Offer> getOffers();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Offer getOffersByCategory(@PathParam("id") BigInteger idCategory);
}
