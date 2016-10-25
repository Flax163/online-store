package org.vago.catalog.service;

import org.vago.catalog.entity.Offer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;

@Stateless
public class LoadingOfferServiceImpl implements LoadingOfferService
{
    @PersistenceContext(unitName = "catalog-service-impl")
    EntityManager entityManager;
 
    @Override
    public Offer loadOffer(BigInteger id)
    {
        return entityManager.find(Offer.class, id);
    }
}
