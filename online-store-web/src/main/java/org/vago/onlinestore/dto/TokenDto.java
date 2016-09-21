package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nonnull;
import java.io.Serializable;

public class TokenDto implements Serializable
{
    private final String token;

    @JsonCreator
    TokenDto(@Nonnull @JsonProperty("token") final String token)
    {
        this.token = token;
    }

    @Nonnull
    public String getToken()
    {
        return token;
    }
}
