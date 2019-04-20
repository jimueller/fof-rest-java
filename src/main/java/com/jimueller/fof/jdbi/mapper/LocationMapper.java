package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.Address;
import com.jimueller.fof.api.Location;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationMapper implements RowMapper<Location> {
    @Override
    public Location map(ResultSet rs, StatementContext ctx) throws SQLException {
        Address address = new Address(
                rs.getString("street"),
                rs.getString("city"),
                rs.getString("state"),
                rs.getString("postal_code"),
                rs.getString("postal_code_ext")
        );

        return new Location(
                rs.getLong("loc_id"),
                rs.getString("name"),
                address,
                rs.getDouble("latitude"),
                rs.getDouble("longitude")
        );
    }
}
