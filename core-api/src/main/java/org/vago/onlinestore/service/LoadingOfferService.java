package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface LoadingOfferService
{
    Collection<Offer> loadAllOffers();
    Offer loadOffer(BigInteger id);
}
