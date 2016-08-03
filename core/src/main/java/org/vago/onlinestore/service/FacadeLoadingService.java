package org.vago.onlinestore.service;

import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;
import org.vago.onlinestore.model.CategoryOffer;
import org.vago.onlinestore.model.Offer;

import java.math.BigInteger;
import java.util.List;

public interface FacadeLoadingService
{
    List<CategoryDto> loadAllCategories();

    CategoryDto loadCategory(BigInteger id);

    OfferDto loadOffer(BigInteger id);
}
