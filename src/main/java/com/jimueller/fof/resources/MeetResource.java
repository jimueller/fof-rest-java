package com.jimueller.fof.resources;

import com.codahale.metrics.annotation.Timed;
import com.jimueller.fof.api.Meet;
import com.jimueller.fof.jdbi.MeetDAO;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("meets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MeetResource {
    private MeetDAO meetDAO;


    public MeetResource(MeetDAO meetDAO){
        this.meetDAO  = meetDAO;
    }

    @GET
    @Timed
    public List<Meet> listMeets(){
        return meetDAO.getAllMeets();
    }
}
