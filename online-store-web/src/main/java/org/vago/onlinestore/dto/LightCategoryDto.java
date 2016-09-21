package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;
import java.io.Serializable;
import java.math.BigInteger;

public class LightCategoryDto implements Serializable
{
    private final BigInteger id;
    private final String name;

    @JsonCreator
    LightCategoryDto(@Nonnull @JsonProperty("id") final BigInteger id,
                     @Nonnull @JsonProperty("name") final String name)
    {
        this.id = id;
        this.name = name;
    }

    @Nonnull
    public BigInteger getId()
    {
        return id;
    }

    @Nonnull
    public String getName()
    {
        return name;
    }
}
