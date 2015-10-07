package org.vago.onlinestore.service;

import org.vago.onlinestore.model.CategoryOffer;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.math.BigInteger;
import java.util.List;

@Local
@Remote
public interface LoadingCategoryService
{
    List<CategoryOffer> loadAllCategories();

    CategoryOffer loadCategory(BigInteger id);

}
