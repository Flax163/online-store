package org.vago.onlinestore.converter;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.CreatorDto;
import org.vago.onlinestore.dto.OfferDto;
import org.vago.onlinestore.model.CategoryOffer;
import org.vago.onlinestore.model.Offer;

import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;

public class CategoryConverter implements Converter<CategoryDto, CategoryOffer>
{
    private final OfferConverter offerConverter;

    @Inject
    public CategoryConverter(OfferConverter offerConverter)
    {
        this.offerConverter = offerConverter;
    }

    @Override
    public CategoryDto convert(CategoryOffer categoryOffer)
    {
        BigInteger id = categoryOffer.getId();
        String name = categoryOffer.getName();
        List<OfferDto> offers = Lists.transform(categoryOffer.getOffers(), new Function<Offer, OfferDto>()
        {
            @Override
            public OfferDto apply(Offer offer)
            {
                return offerConverter.convert(offer);
            }
        });

        return CreatorDto.createCategory(id, name, offers);
    }
}