package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Course {

    @JsonProperty
    private long courseId;
    @JsonProperty
    private double lengthKm;
    @JsonProperty
    private double climbInMeters;
    @JsonProperty
    private long numControls;
    @JsonProperty
    private long compId;

    public Course() {
    }

    public Course(double lengthKm, double climbInMeters, long numControls, long compId) {
        this.lengthKm = lengthKm;
        this.climbInMeters = climbInMeters;
        this.numControls = numControls;
        this.compId = compId;
    }

    public Course(long courseId, double lengthKm, double climbInMeters, long numControls, long compId) {
        this.courseId = courseId;
        this.lengthKm = lengthKm;
        this.climbInMeters = climbInMeters;
        this.numControls = numControls;
        this.compId = compId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }


    public double getLengthKm() {
        return lengthKm;
    }

    public void setLengthKm(double lengthKm) {
        this.lengthKm = lengthKm;
    }


    public double getClimb() {
        return climbInMeters;
    }

    public void setClimb(double climbM) {
        this.climbInMeters = climbInMeters;
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
                .append("climbInMeters", climbInMeters)
                .append("numControls", numControls)
                .append("compId", compId)
                .toString();
    }
}
