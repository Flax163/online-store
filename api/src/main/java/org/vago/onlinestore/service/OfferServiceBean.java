package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import java.math.BigInteger;
import java.util.List;

public interface OfferServiceBean
{
    List<Offer> getServices();
    Offer getServiceById(BigInteger id);
}
