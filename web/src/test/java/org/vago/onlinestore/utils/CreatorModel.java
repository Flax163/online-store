package org.vago.onlinestore.utils;

import org.vago.onlinestore.dto.OfferVO;
import org.vago.onlinestore.model.Offer;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CreatorModel
{
    public static Offer createOffer(long id, String name, String description, double price)
    {
        return new Offer(BigInteger.valueOf(id), name, description, BigDecimal.valueOf(price));
    }

    public static OfferVO createOfferViewModel(long id, String name, String description, double price)
    {
        return new OfferVO(BigInteger.valueOf(id), name, description, BigDecimal.valueOf(price));
    }
}
