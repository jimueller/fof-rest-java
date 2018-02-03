package com.jimueller.fof.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CompetesOn {

    @JsonProperty
    private long courseId;

    @JsonProperty
    private long ageGroupId;

    public CompetesOn(){

    }

    public CompetesOn(long courseId, long ageGroupId) {
        this.courseId = courseId;
        this.ageGroupId = ageGroupId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }


    public long getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(long ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("courseId", courseId)
                .append("ageGroupId", ageGroupId)
                .toString();
    }

}
