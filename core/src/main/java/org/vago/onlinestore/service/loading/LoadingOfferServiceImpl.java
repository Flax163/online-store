package org.vago.onlinestore.service.loading;

import org.vago.onlinestore.model.Offer;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.math.BigInteger;

@Stateless
public class LoadingOfferServiceImpl implements LoadingOfferService
{
    @PersistenceContext(unitName = "online-store-persistence-unit")
    EntityManager entityManager;
 
    @Override
    public Offer loadOffer(BigInteger id)
    {
        return entityManager.find(Offer.class, id);
    }
}
