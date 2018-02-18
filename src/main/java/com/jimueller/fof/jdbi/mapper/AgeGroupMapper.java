package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.AgeGroup;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AgeGroupMapper implements RowMapper<AgeGroup> {
    public AgeGroup map(ResultSet r, StatementContext ctx) throws SQLException {
        return new AgeGroup(
                r.getInt("age_group_id"),
                r.getString("name")
        );
    }
}
