package org.vago.onlinestore.catalog.service;

import org.vago.onlinestore.catalog.model.CategoryOffer;

import javax.ejb.Local;
import java.math.BigInteger;
import java.util.List;

@Local
public interface LoadingCategoryService
{
    List<CategoryOffer> loadAllCategories();

    CategoryOffer loadCategory(BigInteger id);
}
