package org.vago.onlinestore.service.loading;

import org.vago.onlinestore.model.CategoryOffer;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.math.BigInteger;
import java.util.List;

@Local
public interface LoadingCategoryService
{
    List<CategoryOffer> loadAllCategories();

    CategoryOffer loadCategory(BigInteger id);

}
