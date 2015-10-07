package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

public class OfferDto
{
    private BigInteger id;
    private String name;
    private String description;
    private double price;

    @JsonCreator
    protected OfferDto(final @JsonProperty("id") BigInteger id,
                       final @JsonProperty("name") String name,
                       final @JsonProperty("description") String description,
                       final @JsonProperty("price") double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    protected OfferDto()
    {
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

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}
