package org.vago.onlinestore.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

@XmlRootElement
public class OfferViewModel
{
    private BigInteger id;
    private String name;
    private String description;
    private BigDecimal price;
    private int stars;

    public OfferViewModel(BigInteger id, String name, String description, BigDecimal price, int stars)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stars = stars;
    }

    public OfferViewModel()
    {
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

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice(BigDecimal price)
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

    public int getStars()
    {
        return stars;
    }

    public void setStars(int stars)
    {
        this.stars = stars;
    }


    //TODO: Override equals and hashCode
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof OfferViewModel)) return false;

        OfferViewModel that = (OfferViewModel) o;

        if (stars != that.stars) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + stars;
        return result;
    }
}
