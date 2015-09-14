package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import static org.vago.onlinestore.ConstantsQuery.*;

@Stateless
public class LoadingOfferServiceImpl implements LoadingOfferService
{
    @PersistenceContext(unitName = "online-store-persistence-unit", type = PersistenceContextType.TRANSACTION)
    EntityManager entityManager;

    @Override
    public List<Offer> getServices()
    {
        return entityManager.createQuery(SELECT_ALL_OFFERS_QUERY).getResultList();
    }

    @Override
    public Offer getServiceById(BigInteger id)
    {
        return entityManager.find(Offer.class, id);
    }
}
