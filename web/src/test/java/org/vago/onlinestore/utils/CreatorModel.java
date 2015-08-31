package org.vago.onlinestore.utils;

import org.vago.onlinestore.dto.OfferViewModel;
import org.vago.onlinestore.model.Offer;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CreatorModel
{
    public static Offer createOffer(long id, String name, String description, double price, int stars)
    {
        return new Offer(BigInteger.valueOf(id), name, description, BigDecimal.valueOf(price), stars);
    }

    public static OfferViewModel createOfferViewModel(long id, String name, String description, double price, int stars)
    {
        return new OfferViewModel(BigInteger.valueOf(id), name, description, BigDecimal.valueOf(price), stars);
    }
}
