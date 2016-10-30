package org.vago.catalog.service;

import org.vago.catalog.entity.Category;

import javax.ejb.Local;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

@Local
public interface LoadingCategoryService
{
    List<Category> loadAllCategories();

    Category loadCategory(BigInteger id);
}
