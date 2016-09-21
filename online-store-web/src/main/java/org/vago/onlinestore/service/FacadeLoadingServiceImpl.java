package org.vago.onlinestore.service;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.vago.onlinestore.catalog.model.CategoryOffer;
import org.vago.onlinestore.catalog.service.LoadingCategoryService;
import org.vago.onlinestore.catalog.service.LoadingOfferService;
import org.vago.onlinestore.converter.CategoryConverter;
import org.vago.onlinestore.converter.OfferConverter;
import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;

import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;

public class FacadeLoadingServiceImpl implements FacadeLoadingService
{
    private final LoadingCategoryService loadingCategoryService;
    private final LoadingOfferService loadingOfferService;
    private final CategoryConverter categoryConverter;
    private final OfferConverter offerConverter;

    @Inject
    public FacadeLoadingServiceImpl(final LoadingCategoryService loadingCategoryService,
                                    final LoadingOfferService loadingOfferService,
                                    final CategoryConverter categoryConverter,
                                    final OfferConverter offerConverter)
    {
        this.loadingCategoryService = loadingCategoryService;
        this.loadingOfferService = loadingOfferService;
        this.categoryConverter = categoryConverter;
        this.offerConverter = offerConverter;
    }

    @Override
    public List<CategoryDto> loadAllCategories()
    {
        return Lists.transform(loadingCategoryService.loadAllCategories(), new Function<CategoryOffer, CategoryDto>()
        {
            @Override
            public CategoryDto apply(CategoryOffer category)
            {
                return categoryConverter.convert(category);
            }
        });
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
