package org.vago.onlinestore.endpoint;

import java.math.BigInteger;

public interface OfferServiceEndPoint
{
    String getOffers();

    String getOffersByCategory(BigInteger idCategory);
}
