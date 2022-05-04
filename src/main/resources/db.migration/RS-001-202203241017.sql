CREATE SCHEMA radiostation;

CREATE TABLE radiostation.author(
    author_id       SERIAL PRIMARY KEY ,
    author_name     VARCHAR(50) UNIQUE
);

CREATE TABLE radiostation.singer(
    singer_id       SERIAL PRIMARY KEY ,
    singer_name     VARCHAR(50) UNIQUE
);

CREATE TABLE radiostation.genre(
    genre_id        SERIAL PRIMARY KEY ,
    genre_name      VARCHAR(20) UNIQUE
);

CREATE TABLE radiostation.album(
    album_id        SERIAL PRIMARY KEY ,
    album_name      VARCHAR(50) UNIQUE
);

CREATE TABLE radiostation.record(
    record_id       SERIAL PRIMARY KEY ,
    record_name     VARCHAR(50),
    author_id       INTEGER,
    album_id        INTEGER,
    singer_id       INTEGER,
    genre_id        INTEGER,
    year            INTEGER,
    time            FLOAT,
    rating          FLOAT
);

CREATE TABLE radiostation.request(
    request_id      SERIAL PRIMARY KEY ,
    record_name     VARCHAR(50),
    author_name     VARCHAR(50),
    album_name      VARCHAR(50),
    singer_name     VARCHAR(50),
    genre_name      VARCHAR(20),
    date            DATE NOT NULL ,
    completed       BOOLEAN
);

CREATE TABLE radiostation.program(
    program_id      SERIAL PRIMARY KEY ,
    length          INTEGER NOT NULL ,
    genre_id        INTEGER,
    date            DATE NOT NULL
);

CREATE TABLE radiostation.playbill(
    id              SERIAL PRIMARY KEY ,
    program_id      INTEGER,
    record_id       INTEGER,
    request_id      INTEGER
);