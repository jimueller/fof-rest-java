package com.jimueller.fof.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.jdbi.v3.core.mapper.reflect.ColumnName;

import java.util.Objects;
import java.util.StringJoiner;

public class Club {

    @JsonProperty
    @ColumnName("club_id")
    private long id;

    @JsonProperty
    @NotEmpty
    private String name;

    @JsonProperty
    @ColumnName("abbv")
    @NotEmpty
    @Length(min = 4, max = 4, message = "Club Abbreviation must be four characters.")
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

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Club club = (Club) o;
        return id == club.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Club.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("abbreviation='" + abbreviation + "'")
                .toString();
    }
}
