package org.vago.onlinestore.convert;

import org.vago.onlinestore.convert.anotation.OfferConverter;
import org.vago.onlinestore.dto.OfferVO;
import org.vago.onlinestore.model.Offer;

@OfferConverter
public class OfferViewModelConverter implements ViewModelConverter<OfferVO, Offer>
{
    @Override
    public OfferVO convert(Offer offer)
    {
        OfferVO offerVO = new OfferVO();
        offerVO.setId(offer.getId());
        offerVO.setName(offer.getName());
        offerVO.setDescription(offer.getDescription());
        offerVO.setPrice(offer.getPrice());
        return offerVO;
    }
}
