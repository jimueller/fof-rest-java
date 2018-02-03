package com.jimueller.fof.jdbi;

import com.jimueller.fof.api.Club;
import com.jimueller.fof.jdbi.mapper.ClubMapper;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

public interface ClubDAO {
    @SqlUpdate("INSERT INTO club VALUES (?, ?, ?")
    void insert(int id, String name, String abbreviation);

    @SqlUpdate("INSERT INTO club(id, name, abbreviation VALUES (:id, :name, :abbreviation)")
    void insert(@BindBean Club club);

    @SqlQuery("SELECT * FROM club ORDER BY name")
    @RegisterMapper(ClubMapper.class)
    List<Club> listClubs();

    @SqlQuery("SELECT * FROM club WHERE name = :id")
    @RegisterMapper(ClubMapper.class)
    Club getClubById(int id);

}
