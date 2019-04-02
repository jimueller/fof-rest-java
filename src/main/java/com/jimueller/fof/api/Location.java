package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jdbi.v3.core.mapper.Nested;

import java.util.StringJoiner;

public class Location {

    @JsonProperty
    private long locId;
    @JsonProperty
    private String name;
    @JsonProperty
    @Nested
    private Address address;

    public Location() {
    }

    public Location(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Location(long locId, String name, Address address) {
        this.locId = locId;
        this.name = name;
        this.address = address;
    }

    public long getLocId() {
        return locId;
    }

    public void setLocId(long locId) {
        this.locId = locId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Location.class.getSimpleName() + "[", "]")
                .add("locId=" + locId)
                .add("name='" + name + "'")
                .add("address=" + address)
                .toString();
    }
}
