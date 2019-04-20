package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Runs {

    @JsonProperty
    private long memId;
    @JsonProperty
    private long courseId;
    @JsonProperty
    private LocalDateTime startTime;
    @JsonProperty
    private LocalDateTime finishTime;
    @JsonProperty
    private String explanatoryCode;

    public Runs() {
    }

    public Runs(long memId, long courseId, LocalDateTime startTime, LocalDateTime finishTime, String explanatoryCode) {
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


    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }


    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
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
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("memId", memId)
                .append("courseId", courseId)
                .append("startTime", startTime)
                .append("finishTime", finishTime)
                .append("explanatoryCode", explanatoryCode)
                .toString();
    }
}
