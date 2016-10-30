package org.vago.onlinestore.service;

import org.vago.onlinestore.dto.CategoryDto;
import org.vago.onlinestore.dto.OfferDto;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.math.BigInteger;
import java.util.List;

public interface FacadeLoadingService
{
    @Nonnull
    List<CategoryDto> loadAllCategories();

    @Nullable
    CategoryDto loadCategory(@Nonnull BigInteger idCategory);

    @Nonnull
    List<OfferDto> loadOffersInCategory(@Nonnull BigInteger idCategory);

    @Nullable
    OfferDto loadOffer(@Nonnull BigInteger idOffer);
}
