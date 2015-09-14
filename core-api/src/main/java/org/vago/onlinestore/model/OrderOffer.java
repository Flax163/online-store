package org.vago.onlinestore.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "ORDERS_OFFER", schema = "ONLINE_STORE")
public class OrderOffer implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "ORDER_OFFER_ID")
    private BigInteger id;

    @ManyToOne
    @JoinColumn(name = "OFFER_ID")
    private Offer offer;

    @Column(name = "OFFER_COUNT", nullable = false)
    private int count;

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

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }
}
