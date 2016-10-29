package org.vago.onlinestore.service;

import org.vago.catalog.service.LoadingCategoryService;
import org.vago.catalog.service.LoadingOfferService;
import org.vago.onlinestore.converter.CategoryConverter;
import org.vago.onlinestore.converter.OfferConverter;
import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;

import javax.inject.Inject;
import java.math.BigInteger;
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

    @Override
    public List<CategoryDto> loadAllCategories()
    {
        return loadingCategoryService.loadAllCategories()
                .stream()
                .map(categoryConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto loadCategory(BigInteger id)
    {
        return categoryConverter.convert(loadingCategoryService.loadCategory(id));
    }

    @Override
    public OfferDto loadOffer(BigInteger id)
    {
        return offerConverter.convert(loadingOfferService.loadOffer(id));
    }
}
