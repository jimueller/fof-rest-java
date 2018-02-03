package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.sql.Timestamp;

public class Runs {

    @JsonProperty
    private long memId;
    @JsonProperty
    private long courseId;
    @JsonProperty
    private java.sql.Timestamp startTime;
    @JsonProperty
    private java.sql.Timestamp finishTime;
    @JsonProperty
    private String explanatoryCode;

    public Runs() {
    }

    public Runs(long memId, long courseId, Timestamp startTime, Timestamp finishTime, String explanatoryCode) {
        this.memId = memId;
        this.courseId = courseId;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.explanatoryCode = explanatoryCode;
    }

    public long getMemId() {
        return memId;
    }

    public void setMemId(long memId) {
        this.memId = memId;
    }


    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }


    public java.sql.Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(java.sql.Timestamp startTime) {
        this.startTime = startTime;
    }


    public java.sql.Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(java.sql.Timestamp finishTime) {
        this.finishTime = finishTime;
    }


    public String getExplanatoryCode() {
        return explanatoryCode;
    }

    public void setExplanatoryCode(String explanatoryCode) {
        this.explanatoryCode = explanatoryCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("memId", memId)
                .append("courseId", courseId)
                .append("startTime", startTime)
                .append("finishTime", finishTime)
                .append("explanatoryCode", explanatoryCode)
                .toString();
    }
}
