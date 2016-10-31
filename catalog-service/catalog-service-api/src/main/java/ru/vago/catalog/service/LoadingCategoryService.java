package ru.vago.catalog.service;

import ru.vago.catalog.entity.Category;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ejb.Local;
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
