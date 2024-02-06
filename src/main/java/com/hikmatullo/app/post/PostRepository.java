package com.hikmatullo.app.post;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostRepository {
    private final JdbcTemplate jdbcTemplate;
    private final String SELECT_QUERY = "SELECT * FROM posts";

    public List<Post> findAll() {
        return jdbcTemplate.query(SELECT_QUERY, BeanPropertyRowMapper.newInstance(Post.class));
    }
}
