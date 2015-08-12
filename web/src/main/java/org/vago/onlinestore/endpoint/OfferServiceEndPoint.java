package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.model.Offer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.List;

public interface OfferServiceEndPoint
{
    List<Offer> getOffers();

    Offer getOffersByCategory(BigInteger idCategory);
}
