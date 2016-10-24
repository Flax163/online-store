package org.vago.onlinestore.converter;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.vago.catalog.entity.Category;
import org.vago.catalog.entity.Offer;
import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.FactoryDto;
import org.vago.onlinestore.dto.OfferDto;

import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;

public class CategoryConverter implements Converter<CategoryDto, Category>
{
    private final OfferConverter offerConverter;

    @Inject
    public CategoryConverter(OfferConverter offerConverter)
    {
        this.offerConverter = offerConverter;
    }

    @Override
    public CategoryDto convert(Category category)
    {
        BigInteger id = category.getId();
        String name = category.getName();
        List<OfferDto> offers = Lists.transform(category.getOffers(), new Function<Offer, OfferDto>()
        {
            @Override
            public OfferDto apply(Offer offer)
            {
                return offerConverter.convert(offer);
            }
        });

        return FactoryDto.createCategory(id, name, offers);
    }
}
