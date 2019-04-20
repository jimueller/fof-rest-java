package com.jimueller.fof.resources;

import com.codahale.metrics.annotation.Timed;
import com.jimueller.fof.api.Meet;
import com.jimueller.fof.jdbi.MeetDAO;
import io.dropwizard.jersey.PATCH;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.util.List;

@Path("meets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MeetResource {
    private MeetDAO meetDAO;

    public MeetResource(MeetDAO meetDAO) {
        this.meetDAO = meetDAO;
    }

    @GET
    @Timed
    public List<Meet> listMeets() {
        return meetDAO.getAllMeets();
    }

    @GET
    @Timed
    @Path("/id/{id}")
    public Meet getMeetById(@PathParam("id") long id) {
        Meet meet = meetDAO.getMeetById(id);
        if(null == meet){
            throw new WebApplicationException("Meet with id:" + String.valueOf(id) + " does not exist",
                    Response.Status.NOT_FOUND);
        }
        return meet;
    }

    @PUT
    @Timed
    @Path("/id/{id}")
    public Meet replaceMeet(@PathParam("id") long id, Meet updatedMeet) throws WebApplicationException {
        if (updatedMeet.getMeetId() != 0 && updatedMeet.getMeetId() != id) {
            throw new WebApplicationException("If meet.meetId is provided, it must match /id/ in path", 400);
        }

        updatedMeet.setMeetId(id);
        long updatedId = meetDAO.upsertMeet(updatedMeet);
        return meetDAO.getMeetById(updatedId);
    }

    @DELETE
    @Timed
    @Path("/id/{id}")
    public Response deleteMeetById(@PathParam("id") long id){
        meetDAO.deleteMeetById(id);
        return Response.noContent().build();
    }

    @POST
    @Timed
    public Response addMeet(Meet meet) {
        long meetId = meetDAO.addMeet(meet);
        Meet created = meetDAO.getMeetById(meetId);
        return Response.created(
                UriBuilder.fromResource(MeetResource.class)
                        .path("/id/")
                        .path(String.valueOf(meetId))
                        .build())
                .entity(created)
                .build();
    }
}
