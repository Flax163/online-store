package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.List;

public class CategoryDto
{
    private BigInteger id;
    private String name;
    private List<OfferDto> offers;

    @JsonCreator
    public CategoryDto(final @JsonProperty("id") BigInteger id,
                       final @JsonProperty("name") String name,
                       final @JsonProperty("offers") List<OfferDto> offers)
    {
        this.id = id;
        this.name = name;
        this.offers = offers;
    }

    public BigInteger getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<OfferDto> getOffers()
    {
        return offers;
    }

    public void setOffers(List<OfferDto> offers)
    {
        this.offers = offers;
    }
}
