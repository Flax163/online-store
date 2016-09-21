package org.vago.onlinestore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import javax.annotation.Nonnull;
import java.io.Serializable;

public class CredentialDto implements Serializable
{
    private final String login;
    private final String password;

    CredentialDto(@Nonnull @JsonProperty("login") final String login,
                  @Nonnull @JsonProperty("password") final String password)
    {
        this.login = login;
        this.password = password;
    }

    @Nonnull
    public String getLogin()
    {
        return login;
    }

    @Nonnull
    public String getPassword()
    {
        return password;
    }
}
