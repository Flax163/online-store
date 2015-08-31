package org.vago.onlinestore.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Offer
{
    private BigInteger id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stars;

    public Offer(BigInteger id, String name, String description, BigDecimal price, int stars)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stars = stars;
    }

    public Offer()
    {
    }

    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice(BigDecimal price)
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

    public int getStars()
    {
        return stars;
    }

    public void setStars(int stars)
    {
        this.stars = stars;
    }

    //TODO: change enum
    private enum OfferStar
    {
        ONE, TWO, THREE, FOUR, FIVE
    }
}
