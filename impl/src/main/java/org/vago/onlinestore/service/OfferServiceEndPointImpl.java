package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class OfferServiceEndPointImpl implements OfferServiceEndPoint
{
    @Override
    public Offer getOffersByCategory(BigInteger idCategory)
    {
        return new Offer(BigInteger.ONE, "name impl", "description impl", BigDecimal.ONE, 5);
    }

    @Override
    public List<Offer> getOffers()
    {
        List<Offer> offers = new ArrayList<Offer>();
        Offer offer = new Offer();
        offer.setName("impl");
        offer.setDescription("impl");
        offers.add(offer);
        offers.add(offer);
        return offers;
    }
}
