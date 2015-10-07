package org.vago.onlinestore.service;

import org.vago.onlinestore.model.CategoryOffer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;
import java.util.List;

import static org.vago.onlinestore.ConstantsQuery.*;

@Stateless
public class LoadingCategoryServiceImpl implements LoadingCategoryService
{
    @PersistenceContext(unitName = "online-store-persistence-unit")
    EntityManager entityManager;

    @Override
    public List<CategoryOffer> loadAllCategories()
    {
        return entityManager
                .createQuery(SELECT_ALL_CATEGORY_QUERY, CategoryOffer.class)
                .getResultList();
    }

    @Override
    public CategoryOffer loadCategory(BigInteger id)
    {
        return entityManager.find(CategoryOffer.class, id);
    }
}
