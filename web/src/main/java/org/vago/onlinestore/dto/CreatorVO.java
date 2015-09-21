package org.vago.onlinestore.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class CreatorVO
{
    public static OfferVO createOfferVO(final BigInteger id,
                                        final String name,
                                        final String description,
                                        final BigDecimal price)
    {
        return new OfferVO(id, name, description, price);
    }
    private CreatorVO() {}
}
