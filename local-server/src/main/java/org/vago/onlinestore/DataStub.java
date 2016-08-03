package org.vago.onlinestore;

import org.vago.onlinestore.model.CategoryOffer;
import org.vago.onlinestore.model.CreatorModel;
import org.vago.onlinestore.model.Offer;

import java.math.BigInteger;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public final class DataStub
{
    public static final BigInteger OFFER_1_ID = BigInteger.ONE;
    public static final BigInteger OFFER_2_ID = BigInteger.valueOf(2l);
    public static final BigInteger OFFER_3_ID = BigInteger.valueOf(3l);
    public static final BigInteger OFFER_4_ID = BigInteger.valueOf(4l);

    public static final String OFFER_1_NAME = "offer1";
    public static final String OFFER_2_NAME = "offer2";
    public static final String OFFER_3_NAME = "offer3";
    public static final String OFFER_4_NAME = "offer4";

    public static final String OFFER_1_DESCRIPTION = "description1";
    public static final String OFFER_2_DESCRIPTION = "description2";
    public static final String OFFER_3_DESCRIPTION = "description3";
    public static final String OFFER_4_DESCRIPTION = "description4";

    public static final double OFFER_1_PRICE = 50.0;
    public static final double OFFER_2_PRICE = 150.0;
    public static final double OFFER_3_PRICE = 250.0;
    public static final double OFFER_4_PRICE = 350.0;

    public static final BigInteger CATEGORY_OFFER_1_ID = BigInteger.ONE;
    public static final BigInteger CATEGORY_OFFER_2_ID = BigInteger.valueOf(2l);

    public static final String CATEGORY_OFFER_1_NAME = "category1";
    public static final String CATEGORY_OFFER_2_NAME = "category2";

    public static final CategoryOffer CATEGORY_OFFER_1_EMPTY_OFFERS = CreatorModel.createCategoryOffer(CATEGORY_OFFER_1_ID, CATEGORY_OFFER_1_NAME);
    public static final CategoryOffer CATEGORY_OFFER_2_EMPTY_OFFERS = CreatorModel.createCategoryOffer(CATEGORY_OFFER_2_ID, CATEGORY_OFFER_2_NAME);

    public static final Offer OFFER_1 = CreatorModel.createOffer(OFFER_1_ID, OFFER_1_NAME, OFFER_1_DESCRIPTION, OFFER_1_PRICE, CATEGORY_OFFER_1_EMPTY_OFFERS);
    public static final Offer OFFER_2 = CreatorModel.createOffer(OFFER_2_ID, OFFER_2_NAME, OFFER_2_DESCRIPTION, OFFER_2_PRICE, CATEGORY_OFFER_1_EMPTY_OFFERS);
    public static final Offer OFFER_3 = CreatorModel.createOffer(OFFER_3_ID, OFFER_3_NAME, OFFER_3_DESCRIPTION, OFFER_3_PRICE, CATEGORY_OFFER_1_EMPTY_OFFERS);
    public static final Offer OFFER_4 = CreatorModel.createOffer(OFFER_4_ID, OFFER_4_NAME, OFFER_4_DESCRIPTION, OFFER_4_PRICE, CATEGORY_OFFER_2_EMPTY_OFFERS);

    public static final CategoryOffer CATEGORY_OFFER_1_WITH_OFFER = CreatorModel.createCategoryOffer(CATEGORY_OFFER_1_ID, CATEGORY_OFFER_1_NAME, newArrayList(OFFER_1, OFFER_2, OFFER_3));
    public static final CategoryOffer CATEGORY_OFFER_2_WITH_OFFER = CreatorModel.createCategoryOffer(CATEGORY_OFFER_2_ID, CATEGORY_OFFER_2_NAME, newArrayList(OFFER_4));

    public static final List<CategoryOffer> CATEGORIES_OFFER_1_WITH_OFFER = newArrayList(CATEGORY_OFFER_1_WITH_OFFER, CATEGORY_OFFER_2_WITH_OFFER);

    private DataStub() {}
}
