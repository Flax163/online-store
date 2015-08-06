package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

@Path("/offers")
public class OfferServiceImpl implements OfferService
{
    /*@GET
    @Path("/{id}")
    @Produces("application/json")
    @Override
    public Offer getOffersByCategory(@PathParam("id") BigInteger idCategory)
    {
        /*Collection<Offer> offers = new ArrayList<Offer>();
        offers.add(new Offer("name", "description", 5));
        return new Offer("name", "description", 5);
        Offer offer = new Offer();
        offer.setName("dfs");
        offer.setDescription("dsfsd");
        return offer;
    }*/

    @GET
    @Override
    public String getOffers()
    {
        Offer offer = new Offer();
        offer.setName("dfs");
        offer.setDescription("dsfsd");
        return "dfgdfg";
    }


}
