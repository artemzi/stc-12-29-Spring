package ru.innopolis.stc12.spring.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addUser(String login, String passwordHash) {
        String addStudentQuery = "insert into users (username, password, role, user_role, enabled) values " +
                "(?,?,0,?,1)";
        jdbcTemplate.update(addStudentQuery, login, passwordHash, "ROLE_USER");
    }
}
