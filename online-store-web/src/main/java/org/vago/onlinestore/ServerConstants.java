package org.vago.onlinestore;

public final class ServerConstants
{
    public static final String ONLINE_STORE_PATH_APPLICATION = "/rest";
    public static final String ROOT_PATH_END_POINT = "/";

    public static final String ONLINE_STORE_PATH_LOAD_OFFER = "/offer/{offer}";
    public static final String ONLINE_STORE_PATH_LOAD_OFFERS_IN_CATEGORY = "/category/{category}/offer";

    public static final String ONLINE_STORE_PATH_LOAD_CATEGORY = "/category/{category}";
    public static final String ONLINE_STORE_PATH_LOAD_CATEGORIES = "/category";
    public static final String ONLINE_STORE_PATH_AUTHORIZATION = "/authorization";
    public static final String ONLINE_STORE_PATH_CHECK_TOKEN = "/checkToken";

    private ServerConstants() {}
}
