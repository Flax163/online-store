package org.vago.onlinestore.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "RATING_OFFER")
public class RatingOffer implements Serializable
{
    private BigInteger id;
    private Offer offer;
    private Rating rating;

    public RatingOffer(BigInteger id, Offer offer, Rating rating)
    {
        this.id = id;
        this.offer = offer;
        this.rating = rating;
    }

    public BigInteger getId()
    {
        return id;
    }

    public Offer getOffer()
    {
        return offer;
    }

    public void setOffer(Offer offer)
    {
        this.offer = offer;
    }

    public Rating getRating()
    {
        return rating;
    }

    public void setRating(Rating rating)
    {
        this.rating = rating;
    }
}
