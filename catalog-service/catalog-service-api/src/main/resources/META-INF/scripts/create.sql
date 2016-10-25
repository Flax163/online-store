SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

CREATE SCHEMA public;

ALTER SCHEMA public OWNER TO postgres;

COMMENT ON SCHEMA public IS 'standard public schema';

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';

SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

CREATE TABLE "CATEGORIES" (
    "ID_CATEGORY" bigint NOT NULL,
    "NAME_CATEGORY" text,
    "DESCRIPTION_CATEGORY" text
);

ALTER TABLE "CATEGORIES" OWNER TO postgres;

CREATE TABLE "OFFERS" (
    "ID_OFFER" bigint NOT NULL,
    "NAME_OFFER" text,
    "DESCRIPTION_OFFER" text,
    "PRICE_OFFER" real,
    "ID_CATEGORY" bigint
);

ALTER TABLE "OFFERS" OWNER TO postgres;

ALTER TABLE ONLY "CATEGORIES"
    ADD CONSTRAINT "CATEGORIES_pkey" PRIMARY KEY ("ID_CATEGORY");

ALTER TABLE ONLY "OFFERS"
    ADD CONSTRAINT "OFFERS_pkey" PRIMARY KEY ("ID_OFFER");

CREATE INDEX "OFFERS_ID_OFFER_idx" ON "OFFERS" USING btree ("ID_OFFER");

CREATE INDEX "fki_CATEORY_fkey" ON "OFFERS" USING btree ("ID_CATEGORY");

ALTER TABLE ONLY "OFFERS"
    ADD CONSTRAINT "CATEORY_fkey" FOREIGN KEY ("ID_CATEGORY") REFERENCES "CATEGORIES"("ID_CATEGORY");

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;