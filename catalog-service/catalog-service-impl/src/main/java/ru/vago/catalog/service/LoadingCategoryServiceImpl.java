package ru.vago.catalog.service;

import ru.vago.catalog.entity.Category;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.math.BigInteger;
import java.util.List;

@Stateless
public class LoadingCategoryServiceImpl implements LoadingCategoryService
{
    @PersistenceContext(unitName = "CatalogService")
    private EntityManager entityManager;

    @Nonnull
    @Override
    public List<Category> loadAllCategories()
    {
        return entityManager
                .createQuery("SELECT c FROM Category c", Category.class)
                .getResultList();
    }

    @Nullable
    @Override
    public Category loadCategory(@Nonnull final BigInteger id)
    {
        return entityManager.find(Category.class, id);
    }
}
