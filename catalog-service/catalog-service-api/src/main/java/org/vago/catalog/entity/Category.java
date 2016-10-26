package org.vago.catalog.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "CATEGORIES")
public class Category implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "ID_CATEGORY")
    private BigInteger id;

    @Column(name = "NAME_CATEGORY", length = 100, nullable = false)
    private String name;

    @Column(name = "DESCRIPTION_CATEGORY", length = 100)
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Offer> offers;

    public Category() {}

    public Category(BigInteger id, String name, List<Offer> offers)
    {
        this.id = id;
        this.name = name;
        this.offers = offers;
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Offer> getOffers()
    {
        return offers;
    }

    public void setOffers(List<Offer> offers)
    {
        this.offers = offers;
    }
}
