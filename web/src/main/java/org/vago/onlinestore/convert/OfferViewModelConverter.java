package org.vago.onlinestore.convert;

import org.vago.onlinestore.dto.CreatorVO;
import org.vago.onlinestore.dto.OfferVO;
import org.vago.onlinestore.model.Offer;

import javax.inject.Inject;

public class OfferViewModelConverter implements ViewModelConverter<OfferVO, Offer>
{
    @Inject
    public OfferViewModelConverter()
    {}

    @Override
    public OfferVO convert(Offer offer)
    {
        return CreatorVO.createOfferVO(offer.getId(), offer.getName(), offer.getDescription(), offer.getPrice());
    }
}
