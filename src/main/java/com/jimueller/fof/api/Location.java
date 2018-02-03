package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Location {

    @JsonProperty
    private long locId;
    @JsonProperty
    private String name;
    @JsonProperty
    private String street;
    @JsonProperty
    private String city;
    @JsonProperty
    private String state;
    @JsonProperty
    private String postalCode;
    @JsonProperty
    private String postalCodeExt;


    public Location() {
    }

    public Location(String name, String street, String city, String state, String postalCode, String postalCodeExt) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.postalCodeExt = postalCodeExt;
    }

    public Location(long locId, String name, String street, String city, String state, String postalCode, String postalCodeExt) {
        this.locId = locId;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.postalCodeExt = postalCodeExt;
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


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getPostalCodeExt() {
        return postalCodeExt;
    }

    public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("locId", locId)
                .append("name", name)
                .append("street", street)
                .append("city", city)
                .append("state", state)
                .append("postalCode", postalCode)
                .append("postalCodeExt", postalCodeExt)
                .toString();
    }
}
