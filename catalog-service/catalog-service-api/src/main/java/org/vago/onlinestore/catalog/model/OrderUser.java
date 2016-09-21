package org.vago.onlinestore.catalog.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "ORDER_USER", schema = "ONLINE_STORE")
public class OrderUser implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "ORDER_USER_ID")
    private BigInteger id;

    @ManyToOne
    @JoinColumn(name = "ORDER_OFFER_ID")
    private OrderOffer orderOffer;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "ORDER_DATA")
    private Date date;

    public OrderUser()
    {
    }

    public OrderUser(OrderOffer orderOffer, User user, Date date)
    {
        this.orderOffer = orderOffer;
        this.user = user;
        this.date = date;
    }

    public BigInteger getId()
    {
        return id;
    }

    public OrderOffer getOrderOffer()
    {
        return orderOffer;
    }

    public void setOrderOffer(OrderOffer orderOffer)
    {
        this.orderOffer = orderOffer;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
