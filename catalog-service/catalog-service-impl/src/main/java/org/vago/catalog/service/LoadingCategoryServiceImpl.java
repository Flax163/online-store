package org.vago.catalog.service;

import org.vago.catalog.entity.Category;
import org.vago.catalog.ConstantsQuery;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;
import java.util.List;

@Stateless
public class LoadingCategoryServiceImpl implements LoadingCategoryService
{
    @PersistenceContext(unitName = "catalog-service-impl")
    EntityManager entityManager;

    @Override
    public List<Category> loadAllCategories()
    {
        return entityManager
                .createQuery(ConstantsQuery.SELECT_ALL_CATEGORY_QUERY, Category.class)
                .getResultList();
    }

    @Override
    public Category loadCategory(BigInteger id)
    {
        return entityManager.find(Category.class, id);
    }
}
