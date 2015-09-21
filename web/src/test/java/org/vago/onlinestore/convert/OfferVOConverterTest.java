package org.vago.onlinestore.convert;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.vago.onlinestore.dto.OfferVO;
import org.vago.onlinestore.model.Offer;

import static org.vago.onlinestore.utils.CreatorModel.createOffer;
import static org.vago.onlinestore.utils.CreatorModel.createOfferVO;

public class OfferVOConverterTest
{
    ViewModelConverter<OfferVO, Offer> offerViewModelConverter;

    @Before
    public void setUp()
    {
        offerViewModelConverter = new OfferViewModelConverter();
    }

    @Test
    public void convert()
    {
        OfferVO expected = createOfferVO(1l, "name1", "description1", 50.0);
        Offer offer = createOffer(1l, "name1", "description1", 50.0);
        OfferVO result = offerViewModelConverter.convert(offer);

        Assert.assertEquals(expected, result);
    }
}