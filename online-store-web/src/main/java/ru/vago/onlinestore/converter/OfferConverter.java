package ru.vago.onlinestore.converter;

import ru.vago.catalog.entity.Offer;
import ru.vago.onlinestore.dto.FactoryDto;
import ru.vago.onlinestore.dto.OfferDto;

public class OfferConverter implements Converter<OfferDto, Offer>
{
    @Override
    public OfferDto convert(Offer offer)
    {
        return FactoryDto.createOffer(offer.getId(), offer.getName(), offer.getDescription(), offer.getPrice());
    }
}
