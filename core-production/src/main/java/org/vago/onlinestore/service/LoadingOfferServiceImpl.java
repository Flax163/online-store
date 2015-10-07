package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;
import org.vago.onlinestore.service.LoadingOfferService;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

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
