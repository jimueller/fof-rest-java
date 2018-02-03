package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.sql.Date;

public class Member {

    @JsonProperty
    private long memId;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String middleInitial;
    //FIXME need a normal date format
    @JsonProperty
    private java.sql.Date dob;
    @JsonProperty
    private String gender;
    @JsonProperty
    private String streetAddr;
    @JsonProperty
    private String city;
    @JsonProperty
    private String state;
    @JsonProperty
    private String zipCode;
    @JsonProperty
    private java.sql.Date expDate;
    @JsonProperty
    private long ageGroupId;
    @JsonProperty
    private long clubId;

    public Member() {
    }

    public Member(String lastName, String firstName, String middleInitial, Date dob, String gender, String streetAddr, String city, String state, String zipCode, Date expDate, long ageGroupId, long clubId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.dob = dob;
        this.gender = gender;
        this.streetAddr = streetAddr;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.expDate = expDate;
        this.ageGroupId = ageGroupId;
        this.clubId = clubId;
    }

    public Member(long memId, String lastName, String firstName, String middleInitial, Date dob, String gender, String streetAddr, String city, String state, String zipCode, Date expDate, long ageGroupId, long clubId) {
        this.memId = memId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.dob = dob;
        this.gender = gender;
        this.streetAddr = streetAddr;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.expDate = expDate;
        this.ageGroupId = ageGroupId;
        this.clubId = clubId;
    }

    public long getMemId() {
        return memId;
    }

    public void setMemId(long memId) {
        this.memId = memId;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }


    public java.sql.Date getDob() {
        return dob;
    }

    public void setDob(java.sql.Date dob) {
        this.dob = dob;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getStreetAddr() {
        return streetAddr;
    }

    public void setStreetAddr(String streetAddr) {
        this.streetAddr = streetAddr;
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


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public java.sql.Date getExpDate() {
        return expDate;
    }

    public void setExpDate(java.sql.Date expDate) {
        this.expDate = expDate;
    }


    public long getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(long ageGroupId) {
        this.ageGroupId = ageGroupId;
    }


    public long getClubId() {
        return clubId;
    }

    public void setClubId(long clubId) {
        this.clubId = clubId;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("memId", memId)
                .append("lastName", lastName)
                .append("firstName", firstName)
                .append("middleInitial", middleInitial)
                .append("dob", dob)
                .append("gender", gender)
                .append("streetAddr", streetAddr)
                .append("city", city)
                .append("state", state)
                .append("zipCode", zipCode)
                .append("expDate", expDate)
                .append("ageGroupId", ageGroupId)
                .append("clubId", clubId)
                .toString();
    }
}
