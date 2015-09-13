package org.vago.onlinestore.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ORDER_USER")
public class OrderUser
{
    private BigInteger id;
    private OrderOffer orderOffer;
    private User user;
    private Date date;

    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
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
