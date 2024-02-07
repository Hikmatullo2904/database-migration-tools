package com.hikmatullo.app.author;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> findAll() {
        return jdbcTemplate.query("SELECT * FROM author", authorRowMapper());
    }

    public void save(Author author) {
        jdbcTemplate.update("INSERT INTO author(first_name, last_name) VALUES(?, ?)",
                author.getFirstName(), author.getLastName());
    }

    private RowMapper<Author> authorRowMapper() {
        return (rs, rowNum) -> {
            Author author = new Author();
            author.setId(rs.getLong("id"));
            author.setFirstName(rs.getString("first_name"));
            author.setLastName(rs.getString("last_name"));
            return author;
        };
    }
}
