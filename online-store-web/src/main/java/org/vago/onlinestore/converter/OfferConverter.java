package org.vago.onlinestore.converter;

import org.vago.onlinestore.catalog.model.Offer;
import org.vago.onlinestore.dto.FactoryDto;
import org.vago.onlinestore.dto.OfferDto;

public class OfferConverter implements Converter<OfferDto, Offer>
{
    @Override
    public OfferDto convert(Offer offer)
    {
        return FactoryDto.createOffer(offer.getId(), offer.getName(), offer.getDescription(), offer.getPrice());
    }
}
