package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;

public class Competition {

    @JsonProperty
    private long compId;
    @JsonProperty
    private LocalDate date;
    @JsonProperty
    private long locId;
    @JsonProperty
    private long meetId;

    public Competition() {
    }

    public Competition(LocalDate date, long locId, long meetId) {
        this.date = date;
        this.locId = locId;
        this.meetId = meetId;
    }

    public Competition(long compId, LocalDate date, long locId, long meetId) {
        this.compId = compId;
        this.date = date;
        this.locId = locId;
        this.meetId = meetId;
    }

    public long getCompId() {
        return compId;
    }

    public void setCompId(long compId) {
        this.compId = compId;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public long getLocId() {
        return locId;
    }

    public void setLocId(long locId) {
        this.locId = locId;
    }


    public long getMeetId() {
        return meetId;
    }

    public void setMeetId(long meetId) {
        this.meetId = meetId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("compId", compId)
                .append("date", date)
                .append("locId", locId)
                .append("meetId", meetId)
                .toString();
    }
}
