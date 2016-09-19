package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

public class CategoryDto implements Serializable
{
    private BigInteger id;
    private String name;
    private List<OfferDto> offers;

    @JsonCreator
    CategoryDto(@Nonnull @JsonProperty("id") final BigInteger id,
                @Nonnull @JsonProperty("name") final String name,
                @Nonnull @JsonProperty("offers") final List<OfferDto> offers)
    {
        this.id = id;
        this.name = name;
        this.offers = offers;
    }

    @Nonnull
    public BigInteger getId()
    {
        return id;
    }

    @Nonnull
    public String getName()
    {
        return name;
    }

    @Nonnull
    public List<OfferDto> getOffers()
    {
        return offers;
    }
}
