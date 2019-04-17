package com.jimueller.fof.jdbi;

import com.jimueller.fof.api.Meet;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface MeetDAO {
    @SqlQuery("SELECT * FROM meet")
    @RegisterBeanMapper(Meet.class)
    public List<Meet> getAllMeets();

    @SqlQuery("SELECT * FROM meet WHERE meet_id = :meetId")
    @RegisterBeanMapper(Meet.class)
    public Meet getMeetById(@Bind("meetId") long meetId);

    @SqlUpdate("INSERT INTO meet(name, club_id) VALUES (:name, :clubId)")
    @RegisterBeanMapper(Meet.class)
    @GetGeneratedKeys("meet_id")
    public long addMeet(@BindBean Meet meet);

    @SqlUpdate(
            "INSERT INTO meet(meet_id, name, club_id) " +
            "VALUES(:meetId, :name, :clubId) " +
            "ON CONFLICT (meet_id) " +
            "DO UPDATE SET name = :name, club_id = :clubId")
    @GetGeneratedKeys("meet_id")
    public long upsertMeet(@BindBean Meet meet);

    @SqlUpdate("DELETE FROM meet WHERE meet_id = :meetId")
    public void deleteMeetById(@Bind("meetId") long meetId);
}
