package org.vago.onlinestore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "OFFERS")
public class Offer implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OFFER_ID")
    private BigInteger id;

    @Column(name = "OFFER_NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "OFFER_DESCRIPTION", length = 100)
    private String description;

    @Column(name = "OFFER_PRICE")
    private double price;

    @ManyToOne
    @JoinColumn(name = "CATEGORIES_OFFER_ID", referencedColumnName = "CATEGORIE_ID")
    private CategoryOffer categoryOffer;

    public Offer() {}

    public Offer(BigInteger id, String name, String description, double price, CategoryOffer categoryOffer)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryOffer = categoryOffer;
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
