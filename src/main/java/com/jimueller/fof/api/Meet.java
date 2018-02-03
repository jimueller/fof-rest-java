package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Meet {

    @JsonProperty
    private long meetId;
    @JsonProperty
    private String name;
    @JsonProperty
    private long clubId;

    public Meet() {
    }

    public Meet(String name, long clubId) {
        this.name = name;
        this.clubId = clubId;
    }

    public Meet(long meetId, String name, long clubId) {
        this.meetId = meetId;
        this.name = name;
        this.clubId = clubId;
    }

    public long getMeetId() {
        return meetId;
    }

    public void setMeetId(long meetId) {
        this.meetId = meetId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getClubId() {
        return clubId;
    }

    public void setClubId(long clubId) {
        this.clubId = clubId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("meetId", meetId)
                .append("name", name)
                .append("clubId", clubId)
                .toString();
    }
}
