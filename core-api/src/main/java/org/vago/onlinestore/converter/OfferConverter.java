package org.vago.onlinestore.converter;

import org.vago.onlinestore.dto.CreatorDto;
import org.vago.onlinestore.dto.OfferDto;
import org.vago.onlinestore.model.Offer;

public class OfferConverter implements Converter<OfferDto, Offer>
{
    @Override
    public OfferDto convert(Offer offer)
    {
        return CreatorDto.createOffer(offer.getId(), offer.getName(), offer.getDescription(), offer.getPrice());
    }
}
