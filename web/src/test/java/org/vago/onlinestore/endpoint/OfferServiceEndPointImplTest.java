package org.vago.onlinestore.endpoint;

import com.google.common.collect.ImmutableList;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.vago.onlinestore.convert.OfferViewModelConverter;
import org.vago.onlinestore.convert.ViewModelConverter;
import org.vago.onlinestore.dto.OfferViewModel;
import org.vago.onlinestore.model.Offer;
import org.vago.onlinestore.service.OfferServiceBean;

import javax.json.JsonObjectBuilder;
import java.math.BigInteger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.vago.onlinestore.utils.CreatorModel.*;

public class OfferServiceEndPointImplTest
{
    OfferServiceEndPoint offerServiceEndPoint;
    OfferServiceBean offerServiceBean;
    ViewModelConverter<OfferViewModel, Offer> offerViewModelConverter;

    @Before
    public void setup()
    {
        offerServiceBean = mock(OfferServiceBean.class);
        offerViewModelConverter = new OfferViewModelConverter();
        offerServiceEndPoint = new OfferServiceEndPointImpl(offerServiceBean, offerViewModelConverter);

    }

    @Test
    public void getOfferById() throws Exception
    {
        String expectedResult =
                "{\"id\":1,\"name\":\"name1\",\"description\":\"description1\",\"price\":50.0,\"stars\":3}";
        mockGetOfferById();

        String resultJson = offerServiceEndPoint.getOffersByCategory(BigInteger.ONE);

        Assert.assertEquals(expectedResult, resultJson);
    }

    @Test
    public void getOffers() throws Exception
    {
        String expectedResult =
                "[{\"id\":1,\"name\":\"name1\",\"description\":\"description1\",\"price\":50.0,\"stars\":3}," +
                "{\"id\":2,\"name\":\"name2\",\"description\":\"description2\",\"price\":150.0,\"stars\":4}," +
                "{\"id\":3,\"name\":\"name3\",\"description\":\"description3\",\"price\":250.0,\"stars\":4}," +
                "{\"id\":4,\"name\":\"name4\",\"description\":\"description4\",\"price\":350.0,\"stars\":5}]";
        mockGetServices();

        String resultJson = offerServiceEndPoint.getOffers();

        Assert.assertEquals(expectedResult, resultJson);
    }

    private void mockGetServices()
    {
        ImmutableList<Offer> offers = ImmutableList.<Offer>builder()
                .add(createOffer(1l, "name1", "description1", 50.0, 3))
                .add(createOffer(2l, "name2", "description2", 150.0, 4))
                .add(createOffer(3l, "name3", "description3", 250.0, 4))
                .add(createOffer(4l, "name4", "description4", 350.0, 5))
                .build();
        when(offerServiceBean.getServices()).thenReturn(offers);
    }

    private void mockGetOfferById()
    {
        when(offerServiceBean.getServiceById(BigInteger.ONE))
                .thenReturn(createOffer(1l, "name1", "description1", 50.0, 3));
        when(offerServiceBean.getServiceById(BigInteger.valueOf(2l)))
                .thenReturn(createOffer(2l, "name2", "description2", 150.0, 4));
        when(offerServiceBean.getServiceById(BigInteger.valueOf(3l)))
                .thenReturn(createOffer(3l, "name3", "description3", 250.0, 4));
    }
}