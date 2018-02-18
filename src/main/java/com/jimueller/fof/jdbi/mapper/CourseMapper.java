package com.jimueller.fof.jdbi.mapper;

import com.jimueller.fof.api.Course;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseMapper implements RowMapper<Course> {
    public Course map(ResultSet r, StatementContext statementContext) throws SQLException {
        return new Course(
                r.getInt("course_id"),
                r.getDouble("length_in_km"),
                r.getDouble("climb_in_meters"),
                r.getInt("num_controls"),
                r.getInt("comp_id")
        );
    }
}
