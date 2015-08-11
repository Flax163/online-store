package org.vago.onlinestore.service;

import org.vago.onlinestore.bean.OfferServiceBean;
import org.vago.onlinestore.model.Offer;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class OfferServiceEndPointImpl implements OfferServiceEndPoint
{
    @Inject
    OfferServiceBean offerServiceBean;

    @Override
    public Offer getOffersByCategory(BigInteger idCategory)
    {
        return offerServiceBean.getServiceById(idCategory);
    }

    @Override
    public List<Offer> getOffers()
    {
        return offerServiceBean.getServices();
    }
}
