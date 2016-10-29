package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;

import javax.annotation.Nonnull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.List;

import static org.vago.onlinestore.ServerConstants.*;

@Path(ROOT_PATH_END_POINT)
public interface OfferServiceEndPoint
{
    @GET
    @Path(ONLINE_STORE_PATH_LOAD_OFFER)
    @Produces(MediaType.APPLICATION_JSON)
    @Nonnull
    OfferDto loadOffer(@Nonnull @PathParam("category") BigInteger idCategory,
                       @Nonnull @PathParam("offer")BigInteger idOffer);

    @GET
    @Path(ONLINE_STORE_PATH_LOAD_CATEGORY)
    @Produces(MediaType.APPLICATION_JSON)
    @Nonnull
    CategoryDto loadCategory(@Nonnull @PathParam("category") BigInteger id);

    @GET
    @Path(ONLINE_STORE_PATH_LOAD_CATEGORIES)
    @Produces(MediaType.APPLICATION_JSON)
    @Nonnull
    List<CategoryDto> loadCategories();
}
