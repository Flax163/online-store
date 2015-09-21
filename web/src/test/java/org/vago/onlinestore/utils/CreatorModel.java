package org.vago.onlinestore.utils;

import org.vago.onlinestore.dto.CreatorVO;
import org.vago.onlinestore.dto.OfferVO;
import org.vago.onlinestore.model.Offer;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class CreatorModel
{
    public static Offer createOffer(long id, String name, String description, double price)
    {
        return new Offer(BigInteger.valueOf(id), name, description, BigDecimal.valueOf(price), null);
    }

    public static OfferVO createOfferVO(long id, String name, String description, double price)
    {
        return CreatorVO.createOfferVO(BigInteger.valueOf(id), name, description, BigDecimal.valueOf(price));
    }

    private CreatorModel() {}
}
