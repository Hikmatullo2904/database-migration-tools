CREATE TABLE IF NOT EXISTS post (
                                    id BIGINT Serial PRIMARY KEY,
                                    title VARCHAR(255) NOT NULL,
                                    description TEXT,
                                    author_id BIGINT,
                                    FOREIGN KEY (author_id) REFERENCES author (id)
);
