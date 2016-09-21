package org.vago.onlinestore.catalog.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "RATING_OFFER", schema = "ONLINE_STORE")
public class RatingOffer implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "RATING_OFFER_ID")
    private BigInteger id;

    @ManyToOne
    @JoinColumn(name = "OFFER_ID")
    private Offer offer;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "RATING")
    private Rating rating;

    public RatingOffer()
    {
    }

    public RatingOffer(BigInteger id, Offer offer, User user, Rating rating)
    {
        this.id = id;
        this.offer = offer;
        this.user = user;
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

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
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
