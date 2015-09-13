package org.vago.onlinestore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "CATEGORIES_OFFER")
public class CategoryOffer implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "CATEGORIES_OFFER_ID")
    private BigInteger id;

    @Column(name = "CATEGORIES_OFFER_NAME", length = 100, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "")
    private List<Offer> offers;

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

    public List<Offer> getOffers()
    {
        return offers;
    }

    public void setOffers(List<Offer> offers)
    {
        this.offers = offers;
    }
}
