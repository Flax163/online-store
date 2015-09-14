package org.vago.onlinestore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "OFFERS", schema = "ONLINE_STORE")
public class Offer implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "OFFER_ID")
    private BigInteger id;

    @Column(name = "OFFER_NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "OFFER_DESCRIPTION", length = 100)
    private String description;

    @Column(name = "OFFER_PRICE")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "CATEGORIES_OFFER_ID")
    private CategoryOffer categoryOffer;

    public Offer(BigInteger id, String name, String description, BigDecimal price)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Offer()
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

    public CategoryOffer getCategoryOffer()
    {
        return categoryOffer;
    }

    public void setCategoryOffer(CategoryOffer categoryOffer)
    {
        this.categoryOffer = categoryOffer;
    }
}
