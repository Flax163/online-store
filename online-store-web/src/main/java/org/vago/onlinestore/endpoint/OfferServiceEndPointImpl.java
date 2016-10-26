package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;
import org.vago.onlinestore.service.FacadeLoadingService;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import java.math.BigInteger;
import java.util.List;

public class OfferServiceEndPointImpl implements OfferServiceEndPoint
{
    private FacadeLoadingService facadeLoadingService;

    public OfferServiceEndPointImpl() {}

    /*@Inject
    public OfferServiceEndPointImpl(FacadeLoadingService facadeLoadingService)
    {
        this.facadeLoadingService = facadeLoadingService;
    }*/

    @Nonnull
    @Override
    public OfferDto loadOffer(@Nonnull final BigInteger idCategory,
                              @Nonnull final BigInteger idOffer)
    {
        return null;
    }

    @Nonnull
    @Override
    public CategoryDto loadCategory(@Nonnull final BigInteger id)
    {
        return facadeLoadingService.loadCategory(id);
    }

    @Nonnull
    @Override
    public List<CategoryDto> loadCategories()
    {
        return facadeLoadingService.loadAllCategories();
    }
}
