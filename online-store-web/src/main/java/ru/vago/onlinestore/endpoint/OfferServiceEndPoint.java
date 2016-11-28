package ru.vago.onlinestore.endpoint;

import ru.vago.onlinestore.ServerConstants;
import ru.vago.onlinestore.dto.CategoryDto;
import ru.vago.onlinestore.dto.OfferDto;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.List;

@Path(ServerConstants.ROOT_PATH_END_POINT)
public interface OfferServiceEndPoint
{
    @GET
    @Path(ServerConstants.ONLINE_STORE_PATH_LOAD_OFFER)
    @Produces(MediaType.APPLICATION_JSON)
    @Nullable
    OfferDto loadOffer(@Nonnull @PathParam("offer")BigInteger idOffer);

    @GET
    @Path(ServerConstants.ONLINE_STORE_PATH_LOAD_CATEGORY)
    @Produces(MediaType.APPLICATION_JSON)
    @Nullable
    CategoryDto loadCategory(@Nonnull @PathParam("category") BigInteger idCategory);

    @GET
    @Path(ServerConstants.ONLINE_STORE_PATH_LOAD_CATEGORIES)
    @Produces(MediaType.APPLICATION_JSON)
    @Nonnull
    List<CategoryDto> loadCategories();

    @GET
    @Path(ServerConstants.ONLINE_STORE_PATH_LOAD_OFFERS_IN_CATEGORY)
    @Produces(MediaType.APPLICATION_JSON)
    @Nonnull
    List<OfferDto> loadOffersInCategory(@Nonnull @PathParam("category") BigInteger idCategory);
}
