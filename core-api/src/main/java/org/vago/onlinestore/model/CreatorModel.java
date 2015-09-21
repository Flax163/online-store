package org.vago.onlinestore.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public final class CreatorModel
{
    public static Offer createOffer(BigInteger id, String name, String description, BigDecimal price, CategoryOffer categoryOffer)
    {
        return new Offer(id, name, description, price, categoryOffer);
    }

    public static CategoryOffer createCategoryOffer(BigInteger id, String name, List<Offer> offers)
    {
        return new CategoryOffer(id, name, offers);
    }
    private CreatorModel() {}
}
