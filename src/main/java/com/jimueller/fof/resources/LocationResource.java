package com.jimueller.fof.resources;

import com.codahale.metrics.annotation.Timed;
import com.jimueller.fof.api.Location;
import com.jimueller.fof.core.CoordinateService;
import com.jimueller.fof.core.Coordinates;
import com.jimueller.fof.core.NGSCoordinateService;
import com.jimueller.fof.jdbi.LocationDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/locations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LocationResource {
    private LocationDAO locDAO;

    public LocationResource(LocationDAO locationDAO){
        this.locDAO = locationDAO;
    }

    @GET
    @Timed
    public Collection<Location> getLocations(@QueryParam("name") String name){
        return locDAO.find(name);
    }

    @GET
    @Path("/coordinates")
    @Timed
    public Coordinates convertLatLong(@QueryParam("lat") double lat, @QueryParam("lon") double lon){
        CoordinateService coordinateService = new NGSCoordinateService();
        return coordinateService.dmsFromLatLong(new Coordinates(lat,lon));
    }


}
