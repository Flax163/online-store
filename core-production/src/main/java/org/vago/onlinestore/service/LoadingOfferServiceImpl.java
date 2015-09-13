package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import javax.ejb.Stateless;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class LoadingOfferServiceImpl implements LoadingOfferService
{
    @Override
    public List<Offer> getServices()
    {
        List<Offer> offers = new ArrayList<Offer>();
        Offer offer = new Offer();
        offer.setName("impl");
        offer.setDescription("impl");
        offers.add(offer);
        offers.add(offer);
        return offers;
    }

    @Override
    public Offer getServiceById(BigInteger id)
    {
        return new Offer(BigInteger.ONE, "name impl", "description impl", BigDecimal.ONE, 5);
    }
}
