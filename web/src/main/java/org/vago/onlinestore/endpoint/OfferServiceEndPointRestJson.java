package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.model.Offer;
import org.vago.onlinestore.service.OfferServiceBean;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.List;

@Path("/offers")
public class OfferServiceEndPointRestJson implements OfferServiceEndPoint
{
    @EJB
    OfferServiceBean offerServiceBean;

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Offer getOffersByCategory(@PathParam("id") BigInteger idCategory)
    {
        return offerServiceBean.getServiceById(idCategory);
    }

    @Override
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Offer> getOffers()
    {
        return offerServiceBean.getServices();
    }
}
