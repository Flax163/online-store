CREATE TABLE IF NOT EXISTS public.CATEGORIES (
    ID_CATEGORY bigint NOT NULL PRIMARY KEY,
    NAME_CATEGORY text NOT NULL,
    DESCRIPTION_CATEGORY text
);

CREATE TABLE IF NOT EXISTS public.OFFERS (
    ID_OFFER bigint NOT NULL PRIMARY KEY,
    NAME_OFFER text NOT NULL,
    DESCRIPTION_OFFER text,
    PRICE_OFFER real NOT NULL,
    ID_CATEGORY bigint
);