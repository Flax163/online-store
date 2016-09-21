package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class OfferDto implements Serializable
{
    private BigInteger id;
    private String name;
    private String description;
    private double price;

    @JsonCreator
    OfferDto(@Nonnull @JsonProperty("id") final BigInteger id,
             @Nonnull @JsonProperty("name") final String name,
             @Nullable @JsonProperty("description") final String description,
             @JsonProperty("price") final double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
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

    public double getPrice()
    {
        return price;
    }

    @Nullable
    public String getDescription()
    {
        return description;
    }
}
