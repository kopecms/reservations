package app.repositories.impl;

import app.models.Urzytkownik;
import app.models.User;
import app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserJdbcRepository implements UserRepository{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(User user) {
        String sql = "INSERT INTO users " +
                "(id, username) VALUES (seq_users_id.nextval, ?)";

        jdbcTemplate.update(sql, new Object[] { user.getUsername() });
    }

    @Override
    public List<Urzytkownik> getAll() {
        String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql,
                (resultSet, rowNum) ->
                    new Urzytkownik(
                            resultSet.getLong("id"),
                            resultSet.getString("username")
                    ));
    }
}
