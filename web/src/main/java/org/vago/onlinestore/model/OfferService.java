package org.vago.onlinestore.model;

import org.vago.onlinestore.model.Offer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.Collection;

@Path("/offers")
public interface OfferService
{
    @GET
    Offer getOffersByCategory(BigInteger idCategory);
}
