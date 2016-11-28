package ru.vago.onlinestore.converter;

import ru.vago.catalog.entity.Category;
import ru.vago.onlinestore.dto.CategoryDto;
import ru.vago.onlinestore.dto.FactoryDto;
import ru.vago.onlinestore.dto.OfferDto;

import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

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
        List<OfferDto> offers = category.getOffers()
                .stream()
                .map(offerConverter::convert)
                .collect(Collectors.toList());

        return FactoryDto.createCategory(id, name, offers);
    }
}
