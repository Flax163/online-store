package org.vago.catalog.service;

import org.vago.catalog.entity.Category;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;

@Stateless
public class LoadingCategoryServiceImpl implements LoadingCategoryService
{
    @PersistenceContext(unitName = "CatalogService")
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Category> loadAllCategories()
    {
        return entityManager
                .createQuery("SELECT c FROM Category c", Category.class)
                .getResultList();
    }

    @Override
    public Category loadCategory(BigInteger id)
    {
        return entityManager.find(Category.class, id);
    }
}
