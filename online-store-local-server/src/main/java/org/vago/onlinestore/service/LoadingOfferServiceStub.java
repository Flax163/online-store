package org.vago.onlinestore.service;

import org.vago.onlinestore.catalog.model.CategoryOffer;
import org.vago.onlinestore.catalog.model.CreatorModel;
import org.vago.onlinestore.catalog.model.Offer;
import org.vago.onlinestore.catalog.service.LoadingOfferService;

import javax.ejb.Stateless;
import java.math.BigInteger;

import static org.vago.onlinestore.DataStub.*;

@Stateless
public class LoadingOfferServiceStub implements LoadingOfferService
{
    @Override
    public Offer loadOffer(BigInteger id)
    {
        CategoryOffer categoryOffer = CreatorModel.createCategoryOffer(CATEGORY_OFFER_1_ID, CATEGORY_OFFER_1_NAME, null);
        return CreatorModel.createOffer(OFFER_1_ID, OFFER_1_NAME, OFFER_1_DESCRIPTION, OFFER_1_PRICE, categoryOffer);
    }
}
