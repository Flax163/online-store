package org.vago.catalog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "OFFERS",  schema = "ONLINE_STORE")
public class Offer implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OFFER")
    private BigInteger id;

    @Column(name = "NAME_OFFER", length = 100, nullable = false)
    private String name;

    @Column(name = "DESCRIPTION_OFFER", length = 100)
    private String description;

    @Column(name = "PRICE_OFFER")
    private double price;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY")
    private Category category;

    public Offer() {}

    public Offer(BigInteger id, String name, String description, double price, Category category)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
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

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }
}
