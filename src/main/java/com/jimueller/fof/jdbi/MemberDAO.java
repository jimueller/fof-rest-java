package com.jimueller.fof.jdbi;

import com.jimueller.fof.api.Member;
import com.jimueller.fof.jdbi.mapper.MemberMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface MemberDAO {
    // Queries

    @SqlQuery("SELECT * FROM member ORDER BY last_name, first_name")
    @UseRowMapper(MemberMapper.class)
    List<Member> listMembers();

    @SqlQuery("SELECT * FROM member WHERE mem_id = :id")
    @UseRowMapper(MemberMapper.class)
    Member getMemberById(@Bind("id") int id);

    // Inserts
    @SqlUpdate("INSERT INTO member (last_name, first_name, middle_initial, dob, gender, street_addr, city, state, " +
            "zip_code, exp_date, age_group_id, club_id) " +
            "VALUES (:lastName, :firstName, :middleInitial, :dob, :gender, :streetAddr, :city, :state, :zipCode " +
            ":expDate, :ageGroupId, :clubId)")
    @UseRowMapper(MemberMapper.class)
    @GetGeneratedKeys
    int addMember(@BindBean Member member);

}
