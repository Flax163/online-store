package org.vago.onlinestore.dto;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;

public final class FactoryDto
{
    @Nonnull
    public static OfferDto createOffer(@Nonnull final BigInteger id,
                                       @Nonnull final String name,
                                       @Nullable final String description,
                                       final double price)
    {
        return new OfferDto(id, name, description, price);
    }

    @Nonnull
    public static CategoryDto createCategory(@Nonnull final BigInteger id,
                                             @Nonnull final String name,
                                             @Nonnull final List<OfferDto> offers)
    {
        return new CategoryDto(id, name, offers);
    }

    @Nonnull
    public static CredentialDto createCredential(@Nonnull final String login,
                                                 @Nonnull final String password)
    {
        return new CredentialDto(login, password);
    }

    @Nonnull
    public static LightCategoryDto createLightCategory(@Nonnull final BigInteger id,
                                                       @Nonnull final String name)
    {
        return new LightCategoryDto(id, name);
    }

    @Nonnull
    public static TokenDto createToken(@Nonnull final String token)
    {
        return new TokenDto(token);
    }

    private FactoryDto() {}
}
