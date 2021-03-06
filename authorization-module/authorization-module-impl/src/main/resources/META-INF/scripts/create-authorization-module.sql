CREATE SCHEMA IF NOT EXISTS AUTHORIZATION_MODULE;

CREATE SEQUENCE IF NOT EXISTS AUTHORIZATION_MODULE.USER_ID_SEQ INCREMENT BY 1 NO MAXVALUE NO MINVALUE CACHE 1;
CREATE SEQUENCE IF NOT EXISTS AUTHORIZATION_MODULE.GROUP_ID_SEQ INCREMENT BY 1 NO MAXVALUE NO MINVALUE CACHE 1;
CREATE SEQUENCE IF NOT EXISTS AUTHORIZATION_MODULE.ROLE_ID_SEQ INCREMENT BY 1 NO MAXVALUE NO MINVALUE CACHE 1;

CREATE TABLE IF NOT EXISTS AUTHORIZATION_MODULE.USERS(ID_USER BIGINT DEFAULT nextval('AUTHORIZATION_MODULE.USER_ID_SEQ') PRIMARY KEY, LOGIN_USER text NOT NULL, PASSWORD_USER text NOT NULL, TOKEN_USER text);
CREATE TABLE IF NOT EXISTS AUTHORIZATION_MODULE.GROUPS(ID_GROUP BIGINT DEFAULT nextval('AUTHORIZATION_MODULE.GROUP_ID_SEQ') PRIMARY KEY, NAME_GROUP text NOT NULL);
CREATE TABLE IF NOT EXISTS AUTHORIZATION_MODULE.ROLES(ID_ROLE BIGINT DEFAULT nextval('AUTHORIZATION_MODULE.ROLE_ID_SEQ') PRIMARY KEY, NAME_ROLE text NOT NULL);
CREATE TABLE IF NOT EXISTS AUTHORIZATION_MODULE.USER_GROUP(ID_USER BIGINT REFERENCES AUTHORIZATION_MODULE.USERS, ID_GROUP BIGINT REFERENCES AUTHORIZATION_MODULE.GROUPS);
CREATE TABLE IF NOT EXISTS AUTHORIZATION_MODULE.USER_ROLE(ID_USER BIGINT REFERENCES AUTHORIZATION_MODULE.USERS, ID_ROLE BIGINT REFERENCES AUTHORIZATION_MODULE.ROLES);
CREATE TABLE IF NOT EXISTS AUTHORIZATION_MODULE.GROUP_ROLE(ID_GROUP BIGINT REFERENCES AUTHORIZATION_MODULE.GROUPS, ID_ROLE BIGINT REFERENCES AUTHORIZATION_MODULE.ROLES);