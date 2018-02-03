package com.jimueller.fof.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Club {

    @JsonProperty
    private long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String abbreviation;

    public Club() {
    }

    public Club(long id, String name, String abbreviation) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
