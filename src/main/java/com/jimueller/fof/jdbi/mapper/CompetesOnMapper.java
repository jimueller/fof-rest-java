package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.CompetesOn;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompetesOnMapper implements RowMapper<CompetesOn> {
    public CompetesOn map(ResultSet r, StatementContext statementContext) throws SQLException {
        return new CompetesOn(
                r.getInt("course_id"),
                r.getInt("age_group_id")
        );
    }
}
