package org.vago.onlinestore.convert;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.vago.onlinestore.dto.OfferViewModel;
import org.vago.onlinestore.model.Offer;

import static org.vago.onlinestore.utils.CreatorModel.createOffer;
import static org.vago.onlinestore.utils.CreatorModel.createOfferViewModel;

public class OfferViewModelConverterTest
{
    ViewModelConverter<OfferViewModel, Offer> offerViewModelConverter;

    @Before
    public void setUp()
    {
        offerViewModelConverter = new OfferViewModelConverter();
    }

    @Test
    public void convert()
    {
        OfferViewModel expected = createOfferViewModel(1l, "name1", "description1", 50.0, 5);
        Offer offer = createOffer(1l, "name1", "description1", 50.0, 5);
        OfferViewModel result = offerViewModelConverter.convert(offer);

        Assert.assertEquals(expected, result);
    }
}