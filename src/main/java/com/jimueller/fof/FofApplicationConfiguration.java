package com.jimueller.fof;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class FofApplicationConfiguration extends Configuration {
    @Valid
    @NotNull
    DataSourceFactory database = new DataSourceFactory();

    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory){
        this.database = factory;
    }

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory(){
        return database;
    }
}
