package com.jimueller.fof.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgeGroup {

    @JsonProperty
    private long ageGroupId;
    @JsonProperty
    private String name;

    public AgeGroup(String name) {
        this.name = name;
    }

    public AgeGroup(long ageGroupId, String name) {
        this.ageGroupId = ageGroupId;
        this.name = name;
    }

    public long getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(long ageGroupId) {
        this.ageGroupId = ageGroupId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
