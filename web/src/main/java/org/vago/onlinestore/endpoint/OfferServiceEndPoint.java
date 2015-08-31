package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.dto.OfferViewModel;
import org.vago.onlinestore.model.Offer;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigInteger;
import java.util.List;

public interface OfferServiceEndPoint
{
    String getOffers();

    String getOffersByCategory(BigInteger idCategory);
}
