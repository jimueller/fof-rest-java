package com.jimueller.fof.api;

import java.util.StringJoiner;

public class Address {
    String street;
    String city;
    String state;
    String zip5;
    String zip4;

    public Address(String street, String city, String state, String zip5) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip5 = zip5;
    }

    public Address(String street, String city, String state, String zip5, String zip4) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip5 = zip5;
        this.zip4 = zip4;
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

    public String getZip5() {
        return zip5;
    }

    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    public String getZip4() {
        return zip4;
    }

    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("street='" + street + "'")
                .add("city='" + city + "'")
                .add("state='" + state + "'")
                .add("zip5='" + zip5 + "'")
                .add("zip4='" + zip4 + "'")
                .toString();
    }
}