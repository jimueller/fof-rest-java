package com.jimueller.fof.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Club {
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty
    private long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String abbreviation;
}
