package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.Address;
import com.jimueller.fof.api.Member;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberMapper implements RowMapper<Member> {
    @Override
    public Member map(ResultSet r, StatementContext ctx) throws SQLException {
        return new Member(
                r.getInt("mem_id"),
                r.getString("last_name"),
                r.getString("first_name"),
                r.getString("middle_initial"),
                r.getDate("dob").toLocalDate(),
                r.getString("gender"),
                r.getDate("exp_date").toLocalDate(),
                r.getInt("age_group_id"),
                r.getInt("club_id"),
                new Address(r.getString("street_addr"),
                        r.getString("city"),
                        r.getString("state"),
                        r.getString("zip_code"))
        );
    }
}
