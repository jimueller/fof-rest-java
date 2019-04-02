package com.jimueller.fof.jdbi;

import com.jimueller.fof.api.Club;
import com.jimueller.fof.api.Meet;
import com.jimueller.fof.api.Member;
import com.jimueller.fof.jdbi.mapper.ClubMapper;
import com.jimueller.fof.jdbi.mapper.MemberMapper;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.mapper.RowMapperFactory;
import org.jdbi.v3.core.mapper.reflect.BeanMapper;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.config.RegisterRowMapperFactory;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface ClubDAO {
    @SqlUpdate("INSERT INTO club VALUES (?, ?, ?")
    void insert(int id, String name, String abbreviation);

    @SqlUpdate("INSERT INTO club(id, name, abbreviation VALUES (:id, :name, :abbreviation)")
    void insert(@BindBean Club club);

    @SqlQuery("SELECT * FROM club ORDER BY name")
    @UseRowMapper(ClubMapper.class)
    List<Club> listClubs();

    @SqlQuery("SELECT * FROM club WHERE name = :id")
    @UseRowMapper(ClubMapper.class)
    Club getClubById(int id);

    @SqlQuery("SELECT * FROM member WHERE club_id = :id")
    @UseRowMapper(MemberMapper.class)
    List<Member> getClubMembers(@Bind("id") int clubId);

    @SqlQuery("SELECT * FROM meet WHERE club_id = :id")
    @RegisterBeanMapper(Meet.class)
    List<Meet> getClubMeets(@Bind("id") int clubId);
}
