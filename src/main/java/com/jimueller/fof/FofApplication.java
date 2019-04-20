package com.jimueller.fof;

import com.jimueller.fof.jdbi.ClubDAO;
import com.jimueller.fof.jdbi.LocationDAO;
import com.jimueller.fof.jdbi.MeetDAO;
import com.jimueller.fof.jdbi.MemberDAO;
import com.jimueller.fof.resources.ClubResource;
import com.jimueller.fof.resources.LocationResource;
import com.jimueller.fof.resources.MeetResource;
import com.jimueller.fof.resources.MemberResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.jdbi3.bundles.JdbiExceptionsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.jdbi.v3.core.Jdbi;

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

        // Server Swagger UI at path, see pom.xml for swagger-ui source
        bootstrap.addBundle(new AssetsBundle("/swagger-ui", "/docs", "index.html"));

        bootstrap.addBundle(new JdbiExceptionsBundle());
        super.initialize(bootstrap);
    }

    @Override
    public void run(FofApplicationConfiguration configuration, Environment environment) throws Exception {
        // Datasource
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgreswql");

        final ClubDAO clubDAO = jdbi.onDemand(ClubDAO.class);
        final MemberDAO memberDAO = jdbi.onDemand(MemberDAO.class);
        final MeetDAO meetDAO = jdbi.onDemand(MeetDAO.class);
        final LocationDAO locationDAO = jdbi.onDemand(LocationDAO.class);

        // Resources
        final LocationResource locationResource = new LocationResource(locationDAO);
        environment.jersey().register(locationResource);

        final ClubResource clubResource = new ClubResource(clubDAO);
        environment.jersey().register(clubResource);

        final MemberResource memberResource = new MemberResource(memberDAO);
        environment.jersey().register(memberResource);

        final MeetResource meetResource = new MeetResource(meetDAO);
        environment.jersey().register(meetResource);

        final OpenApiResource openApiResource = new OpenApiResource();
        environment.jersey().register(openApiResource);
    }
}
