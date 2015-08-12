package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class OfferServiceBeanStub implements OfferServiceBean
{
    @Override
    public List<Offer> getServices()
    {
        List<Offer> offers = new ArrayList<Offer>();
        Offer offer = new Offer();
        offer.setName("test");
        offer.setDescription("test");
        offers.add(offer);
        offers.add(offer);
        return offers;
    }

    @Override
    public Offer getServiceById(BigInteger id)
    {
        return new Offer(BigInteger.ONE, "test", "test", BigDecimal.ONE, 5);
    }
}
