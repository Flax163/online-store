package org.vago.onlinestore.service;

import com.google.common.collect.Lists;
import org.vago.onlinestore.model.CategoryOffer;
import org.vago.onlinestore.model.CreatorModel;
import org.vago.onlinestore.model.Offer;

import javax.ejb.Stateless;
import java.math.BigInteger;
import java.util.Collection;

import static org.vago.onlinestore.DataStub.*;

@Stateless
public class LoadingOfferServiceStub implements LoadingOfferService
{
    @Override
    public Collection<Offer> loadAllOffers()
    {
        CategoryOffer categoryOffer = CreatorModel.createCategoryOffer(CATEGORY_OFFER_1_ID, CATEGORY_OFFER_1_NAME, null);
        return Lists.newArrayList(
                CreatorModel.createOffer(OFFER_1_ID, OFFER_1_NAME, OFFER_1_DESCRIPTION, OFFER_1_PRICE, categoryOffer),
                CreatorModel.createOffer(OFFER_2_ID, OFFER_2_NAME, OFFER_2_DESCRIPTION, OFFER_2_PRICE, categoryOffer),
                CreatorModel.createOffer(OFFER_3_ID, OFFER_3_NAME, OFFER_3_DESCRIPTION, OFFER_3_PRICE, categoryOffer),
                CreatorModel.createOffer(OFFER_4_ID, OFFER_4_NAME, OFFER_4_DESCRIPTION, OFFER_4_PRICE, categoryOffer)
        );
    }

    @Override
    public Offer loadOffer(BigInteger id)
    {
        CategoryOffer categoryOffer = CreatorModel.createCategoryOffer(CATEGORY_OFFER_1_ID, CATEGORY_OFFER_1_NAME, null);
        return CreatorModel.createOffer(OFFER_1_ID, OFFER_1_NAME, OFFER_1_DESCRIPTION, OFFER_1_PRICE, categoryOffer);
    }
}
