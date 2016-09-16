package org.vago.onlinestore;

public final class ServerConstants
{
    public static final String ONLINE_STORE_PATH_APPLICATION = "/";
    public static final String ONLINE_STORE_PATH_END_POINT = "/jrs";

    public static final String ONLINE_STORE_PATH_LOAD_OFFER = "/category/{category}/offer/{offer}";
    public static final String ONLINE_STORE_PATH_LOAD_OFFERS = "/category/{category}/offer";

    public static final String ONLINE_STORE_PATH_LOAD_CATEGORY = "/category/{category}";
    public static final String ONLINE_STORE_PATH_LOAD_CATEGORIES = "/category";
    public static final String ONLINE_STORE_PATH_AUTHORIZATION = "/authorization";

    private ServerConstants() {}
}
