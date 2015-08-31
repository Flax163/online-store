package org.vago.onlinestore.endpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vago.onlinestore.convert.ViewModelConverter;
import org.vago.onlinestore.convert.anotation.OfferConverter;
import org.vago.onlinestore.dto.OfferViewModel;
import org.vago.onlinestore.model.Offer;
import org.vago.onlinestore.service.OfferServiceBean;

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
    OfferServiceBean offerServiceBean;
    ViewModelConverter<OfferViewModel, Offer> offerViewModelConverter;

    public OfferServiceEndPointImpl()
    {
    }

    @Inject
    public OfferServiceEndPointImpl(OfferServiceBean offerServiceBean, @OfferConverter ViewModelConverter<OfferViewModel, Offer> viewModelConverter)
    {
        this.offerServiceBean = offerServiceBean;
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
            result = new ObjectMapper().writeValueAsString(offerServiceBean.getServiceById(idCategory));
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
            List<OfferViewModel> offerViewModels = new ArrayList<OfferViewModel>();
            List<Offer> offers = offerServiceBean.getServices();
            for (Offer offer : offers)
            {
                offerViewModels.add(offerViewModelConverter.convert(offer));
            }
            result = new ObjectMapper().writeValueAsString(offerViewModels);
        }
        catch(JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
