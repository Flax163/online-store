package org.vago.onlinestore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "CATEGORIES_OFFER", schema = "ONLINE_STORE")
public class CategoryOffer implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "CATEGORIES_OFFER_ID")
    private BigInteger id;

    @Column(name = "CATEGORIES_OFFER_NAME", length = 100, nullable = false)
    private String name;

    @OneToMany(mappedBy = "categoryOffer")
    private List<Offer> offers;

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
