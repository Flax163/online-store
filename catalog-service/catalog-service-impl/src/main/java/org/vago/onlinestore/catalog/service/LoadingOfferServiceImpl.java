package org.vago.onlinestore.catalog.service;

import org.vago.onlinestore.catalog.model.Offer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;

@Stateless
public class LoadingOfferServiceImpl implements LoadingOfferService
{
    @PersistenceContext(unitName = "jpa-persistence-unit")
    EntityManager entityManager;
 
    @Override
    public Offer loadOffer(BigInteger id)
    {
        return entityManager.find(Offer.class, id);
    }
}
