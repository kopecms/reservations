package app.repositories.impl;

import app.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by kopec on 29.04.2017.
 */
@Repository
public class EventJdbcRepository implements EventRepository{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EventJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
