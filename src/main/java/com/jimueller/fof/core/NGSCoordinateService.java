package com.jimueller.fof.core;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class NGSCoordinateService implements CoordinateService {
    @Override
    @Timed
    public Coordinates dmsFromLatLong(Coordinates coordinates) {
        Client client = ClientBuilder.newClient();
        //https://geodesy.noaa.gov/api/ncat/llh?lat=40.0&lon=-80.0&outDatum=nad83(2011)
        WebTarget target = client
                .target("https://geodesy.noaa.gov")
                .path("api/ncat/llh")
                .queryParam("lat", coordinates.latitude)
                .queryParam("lon", coordinates.longitude)
                .queryParam("outDatum","nad83(2011)");

        NGSResponse ngsResponse = client
                .target(target.getUri())
                .request(MediaType.APPLICATION_JSON)
                .get(NGSResponse.class);

        return new Coordinates(
                ngsResponse.getSrcLat(),
                ngsResponse.getSrcLon(),
                ngsResponse.getSrcLatDms(),
                ngsResponse.getSrcLonDms());
    }
}
