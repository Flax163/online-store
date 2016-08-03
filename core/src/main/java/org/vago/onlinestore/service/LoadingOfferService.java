package org.vago.onlinestore.service;

import org.vago.onlinestore.model.Offer;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

@Local
@Remote
public interface LoadingOfferService
{
    Offer loadOffer(BigInteger id);
}
