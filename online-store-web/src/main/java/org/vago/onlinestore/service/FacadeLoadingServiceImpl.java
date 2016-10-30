package org.vago.onlinestore.service;

import org.vago.catalog.entity.Category;
import org.vago.catalog.entity.Offer;
import org.vago.catalog.service.LoadingCategoryService;
import org.vago.catalog.service.LoadingOfferService;
import org.vago.onlinestore.converter.CategoryConverter;
import org.vago.onlinestore.converter.OfferConverter;
import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FacadeLoadingServiceImpl implements FacadeLoadingService
{
    private LoadingCategoryService loadingCategoryService;
    private LoadingOfferService loadingOfferService;
    private CategoryConverter categoryConverter;
    private OfferConverter offerConverter;

    @Inject
    public FacadeLoadingServiceImpl(final LoadingCategoryService loadingCategoryService,
                                    final LoadingOfferService loadingOfferService,
                                    final CategoryConverter categoryConverter,
                                    final OfferConverter offerConverter
    )
    {
        this.loadingCategoryService = loadingCategoryService;
        this.loadingOfferService = loadingOfferService;
        this.categoryConverter = categoryConverter;
        this.offerConverter = offerConverter;
    }

    @Nonnull
    @Override
    public List<CategoryDto> loadAllCategories()
    {
        return loadingCategoryService.loadAllCategories()
                .stream()
                .map(categoryConverter::convert)
                .collect(Collectors.toList());
    }

    @Nullable
    @Override
    public CategoryDto loadCategory(@Nonnull final BigInteger idCategory)
    {
        Category category = loadingCategoryService.loadCategory(idCategory);
        if (category == null)
        {
            return null;
        }
        return categoryConverter.convert(category);
    }

    @Nonnull
    @Override
    public List<OfferDto> loadOffersInCategory(@Nonnull final BigInteger idCategory)
    {
        Category category = loadingCategoryService.loadCategory(idCategory);
        return category == null ? Collections.emptyList() :
                category.getOffers().stream()
                .map(offerConverter::convert)
                .collect(Collectors.toList());
    }

    @Nullable
    @Override
    public OfferDto loadOffer(@Nonnull final BigInteger idOffer)
    {
        Offer offer = loadingOfferService.loadOffer(idOffer);
        if (offer == null)
        {
            return null;
        }
        return offerConverter.convert(offer);
    }
}
