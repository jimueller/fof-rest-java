package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Course {

    @JsonProperty
    private long courseId;
    @JsonProperty
    private String lengthKm;
    @JsonProperty
    private String climbM;
    @JsonProperty
    private long numControls;
    @JsonProperty
    private long compId;

    public Course() {
    }

    public Course(String lengthKm, String climbM, long numControls, long compId) {
        this.lengthKm = lengthKm;
        this.climbM = climbM;
        this.numControls = numControls;
        this.compId = compId;
    }

    public Course(long courseId, String lengthKm, String climbM, long numControls, long compId) {
        this.courseId = courseId;
        this.lengthKm = lengthKm;
        this.climbM = climbM;
        this.numControls = numControls;
        this.compId = compId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }


    public String getLengthKm() {
        return lengthKm;
    }

    public void setLengthKm(String lengthKm) {
        this.lengthKm = lengthKm;
    }


    public String getClimbM() {
        return climbM;
    }

    public void setClimbM(String climbM) {
        this.climbM = climbM;
    }


    public long getNumControls() {
        return numControls;
    }

    public void setNumControls(long numControls) {
        this.numControls = numControls;
    }


    public long getCompId() {
        return compId;
    }

    public void setCompId(long compId) {
        this.compId = compId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("courseId", courseId)
                .append("lengthKm", lengthKm)
                .append("climbM", climbM)
                .append("numControls", numControls)
                .append("compId", compId)
                .toString();
    }
}
