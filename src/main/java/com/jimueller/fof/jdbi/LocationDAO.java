package com.jimueller.fof.jdbi;

import com.jimueller.fof.api.Location;
import com.jimueller.fof.jdbi.mapper.LocationMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface LocationDAO {
    @SqlQuery("SELECT loc_id, name, street, city, state, " +
            "postal_code, postal_code_ext, latitude, longitude " +
            "FROM location " +
            "WHERE lower(name) = lower(:name) " +
            "OR :name IS NULL")
    @UseRowMapper(LocationMapper.class)
    List<Location> find(@Bind("name") String name);
}
