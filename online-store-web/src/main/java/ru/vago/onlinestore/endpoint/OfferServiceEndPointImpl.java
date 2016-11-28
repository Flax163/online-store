package ru.vago.onlinestore.endpoint;

import ru.vago.onlinestore.dto.CategoryDto;
import ru.vago.onlinestore.dto.OfferDto;
import ru.vago.onlinestore.service.FacadeLoadingService;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;

public class OfferServiceEndPointImpl implements OfferServiceEndPoint
{
    private FacadeLoadingService facadeLoadingService;

    public OfferServiceEndPointImpl() {}

    @Inject
    public OfferServiceEndPointImpl(FacadeLoadingService facadeLoadingService)
    {
        this.facadeLoadingService = facadeLoadingService;
    }

    @Nullable
    @Override
    public OfferDto loadOffer(@Nonnull final BigInteger idOffer)
    {
        return facadeLoadingService.loadOffer(idOffer);
    }

    @Nullable
    @Override
    public CategoryDto loadCategory(@Nonnull final BigInteger idCategory)
    {
        return facadeLoadingService.loadCategory(idCategory);
    }

    @Nonnull
    @Override
    public List<CategoryDto> loadCategories()
    {
        return facadeLoadingService.loadAllCategories();
    }

    @Nonnull
    @Override
    public List<OfferDto> loadOffersInCategory(@Nonnull BigInteger idCategory)
    {
        return facadeLoadingService.loadOffersInCategory(idCategory);
    }
}
