package com.jimueller.fof.jdbi;

import com.jimueller.fof.api.Meet;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface MeetDAO {
    @SqlQuery("SELECT * FROM meet")
    @RegisterBeanMapper(Meet.class)
    public List<Meet> getAllMeets();
}
