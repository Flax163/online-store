package org.vago.onlinestore.catalog.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "CATEGORIES")
public class CategoryOffer implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "CATEGORIE_ID")
    private BigInteger id;

    @Column(name = "CATEGORIE_NAME", length = 100, nullable = false)
    private String name;

    @OneToMany(mappedBy = "categoryOffer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Offer> offers;

    public CategoryOffer() {}

    public CategoryOffer(BigInteger id, String name, List<Offer> offers)
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

    public List<Offer> getOffers()
    {
        return offers;
    }

    public void setOffers(List<Offer> offers)
    {
        this.offers = offers;
    }
}
