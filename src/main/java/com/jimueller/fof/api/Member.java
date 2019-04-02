package com.jimueller.fof.api;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jdbi.v3.core.mapper.Nested;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Member {

    @JsonProperty
    private long memId;
    @JsonProperty
    private String lastName;
    @JsonProperty
    private String firstName;
    @JsonProperty
    private String middleInitial;
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dob;
    @JsonProperty
    private String gender;
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate expDate;
    @JsonProperty
    private long ageGroupId;
    @JsonProperty
    private long clubId;
    @Nested
    private Address address;

    public Member() {
    }

    public Member(String lastName, String firstName, String middleInitial, LocalDate dob, String gender,
                  LocalDate expDate, long ageGroupId,
                  long clubId, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.dob = dob;
        this.gender = gender;
        this.expDate = expDate;
        this.ageGroupId = ageGroupId;
        this.clubId = clubId;
        this.address = address;
    }

    public Member(long memId, String lastName, String firstName, String middleInitial, LocalDate dob, String gender,
                  LocalDate expDate, long ageGroupId,
                  long clubId, Address address) {
        this.memId = memId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.dob = dob;
        this.gender = gender;
        this.expDate = expDate;
        this.ageGroupId = ageGroupId;
        this.clubId = clubId;
        this.address = address;
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


    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Member.class.getSimpleName() + "[", "]")
                .add("memId=" + memId)
                .add("lastName='" + lastName + "'")
                .add("firstName='" + firstName + "'")
                .add("middleInitial='" + middleInitial + "'")
                .add("dob=" + dob)
                .add("gender='" + gender + "'")
                .add("expDate=" + expDate)
                .add("ageGroupId=" + ageGroupId)
                .add("clubId=" + clubId)
                .add("address=" + address)
                .toString();
    }
}
