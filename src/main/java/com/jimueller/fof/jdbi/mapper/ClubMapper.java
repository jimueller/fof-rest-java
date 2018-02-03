package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.Club;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClubMapper implements ResultSetMapper<Club> {
    public Club map(int i, ResultSet r, StatementContext statementContext) throws SQLException {
        return new Club(
                r.getInt("club_id"),
                r.getString("name"),
                r.getString("abbv")
        );
    }
}