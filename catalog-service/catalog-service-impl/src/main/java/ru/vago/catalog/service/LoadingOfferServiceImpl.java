package ru.vago.catalog.service;

import ru.vago.catalog.entity.Offer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.math.BigInteger;

@Stateless
public class LoadingOfferServiceImpl implements LoadingOfferService
{
    @PersistenceContext(unitName = "CatalogService")
    private EntityManager entityManager;

    @Nullable
    @Override
    public Offer loadOffer(@Nonnull final BigInteger id)
    {
        return entityManager.find(Offer.class, id);
    }
}
