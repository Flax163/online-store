package org.vago.onlinestore.endpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vago.onlinestore.convert.ViewModelConverter;
import org.vago.onlinestore.convert.anotation.OfferConverter;
import org.vago.onlinestore.dto.OfferVO;
import org.vago.onlinestore.model.Offer;
import org.vago.onlinestore.service.LoadingOfferService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//TODO: see json processing
@Path("offers")
public class OfferServiceEndPointImpl implements OfferServiceEndPoint
{
    LoadingOfferService loadingOfferService;
    ViewModelConverter<OfferVO, Offer> offerViewModelConverter;

    public OfferServiceEndPointImpl()
    {
    }

    @Inject
    public OfferServiceEndPointImpl(LoadingOfferService loadingOfferService, @OfferConverter ViewModelConverter<OfferVO, Offer> viewModelConverter)
    {
        this.loadingOfferService = loadingOfferService;
        this.offerViewModelConverter = viewModelConverter;
    }

    @Override
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getOffersByCategory(@PathParam("id") BigInteger idCategory)
    {
        String result = "";
        try
        {
            result = new ObjectMapper().writeValueAsString(loadingOfferService.getServiceById(idCategory));
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getOffers()
    {
        String result = "";
        try
        {
            List<OfferVO> offerVOs = new ArrayList<OfferVO>();
            List<Offer> offers = loadingOfferService.getServices();
            for (Offer offer : offers)
            {
                offerVOs.add(offerViewModelConverter.convert(offer));
            }
            result = new ObjectMapper().writeValueAsString(offerVOs);
        }
        catch(JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
