package org.vago.onlinestore.catalog.service;

import org.vago.onlinestore.catalog.model.Offer;

import javax.ejb.Local;
import java.math.BigInteger;

@Local
public interface LoadingOfferService
{
    Offer loadOffer(BigInteger id);
}
