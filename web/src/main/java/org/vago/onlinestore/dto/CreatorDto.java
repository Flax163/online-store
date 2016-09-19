package org.vago.onlinestore.dto;

import java.math.BigInteger;
import java.util.List;

public final class CreatorDto
{
    public static OfferDto createOffer(final BigInteger id,
                                          final String name,
                                          final String description,
                                          final double price)
    {
        return new OfferDto(id, name, description, price);
    }

    public static CategoryDto createCategory(final BigInteger id,
                                             final String name,
                                             final List<OfferDto> offers)
    {
        return new CategoryDto(id, name, offers);
    }

    private CreatorDto() {}
}
