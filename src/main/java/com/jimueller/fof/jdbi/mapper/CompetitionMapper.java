package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.Competition;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompetitionMapper implements RowMapper<Competition> {
    public Competition map(ResultSet r, StatementContext statementContext) throws SQLException {
        return new Competition(
                r.getInt("comp_id"),
                r.getDate("date").toLocalDate(),
                r.getInt("loc_id"),
                r.getInt("meet_id")
        );
    }
}
