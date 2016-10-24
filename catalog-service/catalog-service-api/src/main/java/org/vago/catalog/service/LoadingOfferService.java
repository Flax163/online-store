package org.vago.catalog.service;

import org.vago.catalog.entity.Offer;

import javax.ejb.Local;
import java.math.BigInteger;

@Local
public interface LoadingOfferService
{
    Offer loadOffer(BigInteger id);
}
