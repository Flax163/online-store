package org.vago.onlinestore.service.loading;

import org.vago.onlinestore.model.Offer;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

@Local
public interface LoadingOfferService
{
    Offer loadOffer(BigInteger id);
}
