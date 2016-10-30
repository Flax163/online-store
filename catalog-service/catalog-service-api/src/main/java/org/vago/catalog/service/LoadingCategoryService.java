package org.vago.catalog.service;

import org.vago.catalog.entity.Category;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ejb.Local;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

@Local
public interface LoadingCategoryService
{
    @Nonnull
    List<Category> loadAllCategories();

    @Nullable
    Category loadCategory(@Nonnull BigInteger id);
}
