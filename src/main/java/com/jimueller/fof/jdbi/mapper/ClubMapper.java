package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.Club;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClubMapper implements RowMapper<Club> {
    public Club map(ResultSet r, StatementContext statementContext) throws SQLException {
        return new Club(
                r.getInt("club_id"),
                r.getString("name"),
                r.getString("abbv")
        );
    }
}