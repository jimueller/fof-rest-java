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
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface ClubDAO {
    @SqlUpdate("INSERT INTO club(name, abbv) VALUES (:name, :abbreviation)")
    @RegisterBeanMapper(Club.class)
    @GetGeneratedKeys("club_id")
    long insert(@BindBean Club club);

    @SqlUpdate(
            "INSERT INTO club(club_id, name, abbv) " +
            "VALUES (:id, :name, :abbreviation) " +
            "ON CONFLICT (club_id) " +
            "DO UPDATE SET name = :name, abbv = :abbreviation")
    @RegisterBeanMapper(Club.class)
    @GetGeneratedKeys("club_id")
    long upsert(@BindBean Club club);

    @SqlUpdate("DELETE FROM club WHERE club_id = :id")
    void delete(@Bind("id") long clubId);

    @SqlUpdate("DELETE FROM club WHERE abbv = :abbv")
    void delete(@Bind("abbv") String abbreviation);

    @SqlQuery("SELECT * FROM club ORDER BY name")
    @UseRowMapper(ClubMapper.class)
    List<Club> listClubs();

    @SqlQuery("SELECT * FROM club WHERE club_id = :id")
    @UseRowMapper(ClubMapper.class)
    Club getClubById(@Bind("id") long id);

    @SqlQuery("SELECT COUNT(club_id) FROM club WHERE UPPER(abbv) = UPPER(:abbv)")
    long getAbbvCount(@Bind("abbv") String abbv);

    @SqlQuery("SELECT * FROM member WHERE club_id = :id")
    @UseRowMapper(MemberMapper.class)
    List<Member> getClubMembers(@Bind("id") long clubId);

    @SqlQuery("SELECT * FROM meet WHERE club_id = :id")
    @RegisterBeanMapper(Meet.class)
    List<Meet> getClubMeets(@Bind("id") long clubId);
}
