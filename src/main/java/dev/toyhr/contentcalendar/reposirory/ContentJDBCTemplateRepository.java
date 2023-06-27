package dev.toyhr.contentcalendar.reposirory;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContentJDBCTemplateRepository {
    private final JdbcTemplate jdbctemplate;

    public ContentJDBCTemplateRepository(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }

}
