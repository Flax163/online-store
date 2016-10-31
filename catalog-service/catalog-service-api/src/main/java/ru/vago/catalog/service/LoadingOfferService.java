package ru.vago.catalog.service;

import ru.vago.catalog.entity.Offer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ejb.Local;
import java.math.BigInteger;

@Local
public interface LoadingOfferService
{
    @Nullable
    Offer loadOffer(@Nonnull final BigInteger id);
}
