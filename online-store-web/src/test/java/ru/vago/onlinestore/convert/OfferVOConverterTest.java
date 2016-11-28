package ru.vago.onlinestore.convert;

import org.junit.Before;
import ru.vago.catalog.entity.Offer;
import ru.vago.onlinestore.converter.Converter;
import ru.vago.onlinestore.converter.OfferConverter;
import ru.vago.onlinestore.dto.OfferDto;

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