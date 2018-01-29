package com.jimueller.fof;

import com.jimueller.fof.resources.ClubResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FofApplication extends Application<FofApplicationConfiguration> {

    public static void main(String[] args) throws Exception {
        new FofApplication().run(args);
    }

    @Override
    public String getName(){
        return "fof-rest-java";
    }

    @Override
    public void initialize(Bootstrap<FofApplicationConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public void run(FofApplicationConfiguration configuration, Environment environment) throws Exception {
        final ClubResource clubResource = new ClubResource();

        environment.jersey().register(clubResource);
    }
}
