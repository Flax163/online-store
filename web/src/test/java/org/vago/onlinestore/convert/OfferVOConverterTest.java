package org.vago.onlinestore.convert;

import org.junit.Before;
import org.vago.onlinestore.converter.Converter;
import org.vago.onlinestore.converter.OfferConverter;
import org.vago.onlinestore.dto.OfferDto;
import org.vago.onlinestore.model.Offer;

public class OfferVOConverterTest
{
    Converter<OfferDto, Offer> offerConverter;

    @Before
    public void setUp()
    {
        offerConverter = new OfferConverter();
    }

    /*@Test
    public void convert()
    {
        OfferVO expected = createOfferDto(1l, "name1", "description1", 50.0);
        Offer offer = createOffer(1l, "name1", "description1", 50.0);
        OfferVO result = offerViewModelConverter.convert(offer);

        Assert.assertEquals(expected, result);
    }*/
}