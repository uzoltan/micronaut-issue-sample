CREATE TABLE DUMMY
(
    id            VARCHAR(36)      NOT NULL PRIMARY KEY,
    last_modified TIMESTAMP UNIQUE NOT NULL,
    name          VARCHAR(255)     NOT NULL
);