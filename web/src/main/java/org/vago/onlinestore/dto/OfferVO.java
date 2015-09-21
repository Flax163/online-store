package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.math.BigInteger;

public class OfferVO
{

    private BigInteger id;
    private String name;
    private String description;
    private BigDecimal price;

    @JsonCreator
    protected OfferVO(final @JsonProperty("id") BigInteger id,
                   final @JsonProperty("name") String name,
                   final @JsonProperty("description") String description,
                   final @JsonProperty("price") BigDecimal price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public OfferVO()
    {
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

    //TODO: Override equals and hashCode
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof OfferVO)) return false;

        OfferVO that = (OfferVO) o;

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
        return result;
    }
}
