package org.vago.onlinestore.convert;

import org.vago.onlinestore.convert.anotation.OfferConverter;
import org.vago.onlinestore.dto.OfferViewModel;
import org.vago.onlinestore.model.Offer;

@OfferConverter
public class OfferViewModelConverter implements ViewModelConverter<OfferViewModel, Offer>
{
    @Override
    public OfferViewModel convert(Offer offer)
    {
        OfferViewModel offerViewModel = new OfferViewModel();
        offerViewModel.setId(offer.getId());
        offerViewModel.setName(offer.getName());
        offerViewModel.setDescription(offer.getDescription());
        offerViewModel.setPrice(offer.getPrice());
        offerViewModel.setStars(offer.getStars());
        return offerViewModel;
    }
}
