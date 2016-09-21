package org.vago.onlinestore.service;

import org.vago.onlinestore.catalog.model.CategoryOffer;
import org.vago.onlinestore.catalog.service.LoadingCategoryService;

import java.math.BigInteger;
import java.util.List;

import static org.vago.onlinestore.DataStub.*;

public class LoadingCategoryServiceStub implements LoadingCategoryService
{
    @Override
    public List<CategoryOffer> loadAllCategories()
    {
        return CATEGORIES_OFFER_1_WITH_OFFER;
    }

    @Override
    public CategoryOffer loadCategory(BigInteger id)
    {
        return CATEGORIES_OFFER_1_WITH_OFFER
                .stream()
                .filter(category -> category.getId().equals(id))
                .findAny()
                .get();
    }
}
