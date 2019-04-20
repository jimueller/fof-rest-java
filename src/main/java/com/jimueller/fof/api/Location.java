package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.math3.util.Precision;
import org.hibernate.validator.constraints.NotEmpty;
import org.jdbi.v3.core.mapper.Nested;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringJoiner;

public class Location {

    @JsonProperty
    private long locId;
    @JsonProperty
    @NotEmpty
    @NotNull
    private String name;
    @JsonProperty
    @Nested
    private Address address;
    @JsonProperty
    @Min(-90)
    @Max(90)
    private double latitude;
    @JsonProperty
    @Min(-180)
    @Max(180)
    private double longitude;

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

    public Location(long locId, String name, Address address, double latitude, double longitude) {
        this.locId = locId;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(long locId, String name, String street, String city, String state,
                    String zip5, String zip4, double latitude, double longitude){
        this.locId = locId;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = new Address(street, city, state, zip5, zip4);
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = Precision.round(latitude, 6, BigDecimal.ROUND_HALF_UP);
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = Precision.round(longitude, 6, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Location.class.getSimpleName() + "[", "]")
                .add("locId=" + locId)
                .add("name='" + name + "'")
                .add("address=" + address)
                .add("latitude=" + latitude)
                .add("longitude=" + longitude)
                .toString();
    }
}
