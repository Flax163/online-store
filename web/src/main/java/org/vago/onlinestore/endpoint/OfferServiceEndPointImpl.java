package org.vago.onlinestore.endpoint;

import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;
import org.vago.onlinestore.service.FacadeLoadingService;

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

    @Override
    public OfferDto loadOffer(BigInteger id)
    {
        return facadeLoadingService.loadOffer(id);
    }

    @Override
    public CategoryDto loadCategory(BigInteger id)
    {
        return facadeLoadingService.loadCategory(id);
    }

    @Override
    public List<CategoryDto> loadCategories()
    {
        return facadeLoadingService.loadAllCategories();
    }
}
