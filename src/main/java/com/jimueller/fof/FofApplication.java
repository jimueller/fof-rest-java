package com.jimueller.fof;

import com.jimueller.fof.jdbi.ClubDAO;
import com.jimueller.fof.resources.ClubResource;
import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.jdbi.bundles.DBIExceptionsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

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
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        bootstrap.addBundle(new DBIExceptionsBundle());
        super.initialize(bootstrap);
    }

    @Override
    public void run(FofApplicationConfiguration configuration, Environment environment) throws Exception {
        // Datasource
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgreswql");

        final ClubDAO clubDAO = jdbi.onDemand(ClubDAO.class);

        // Resources
        final ClubResource clubResource = new ClubResource(clubDAO);
        environment.jersey().register(clubResource);
    }
}
