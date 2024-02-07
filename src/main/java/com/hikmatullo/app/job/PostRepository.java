package com.hikmatullo.app.job;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {
    private final JdbcTemplate jdbcTemplate;

    private final String SELECT_SQL = "SELECT * FROM job";

    public PostRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Job> findAll() {
        return jdbcTemplate.query(SELECT_SQL, new BeanPropertyRowMapper<>(Job.class));
    }


}
