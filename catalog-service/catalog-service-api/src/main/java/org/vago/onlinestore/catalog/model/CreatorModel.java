package org.vago.onlinestore.catalog.model;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public final class CreatorModel
{
    public static Offer createOffer(BigInteger id, String name, String description, double price, CategoryOffer categoryOffer)
    {
        return new Offer(id, name, description, price, categoryOffer);
    }

    public static CategoryOffer createCategoryOffer(BigInteger id, String name, List<Offer> offers)
    {
        return new CategoryOffer(id, name, offers);
    }

    public static CategoryOffer createCategoryOffer(BigInteger id, String name)
    {
        return new CategoryOffer(id, name, Collections.<Offer>emptyList());
    }
    private CreatorModel() {}
}
