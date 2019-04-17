package com.jimueller.fof.resources;

import com.codahale.metrics.annotation.Timed;
import com.jimueller.fof.api.Club;
import com.jimueller.fof.api.Meet;
import com.jimueller.fof.api.Member;
import com.jimueller.fof.jdbi.ClubDAO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/clubs")
@Produces(MediaType.APPLICATION_JSON)
public class ClubResource {
    private ClubDAO dao;

    public ClubResource(ClubDAO dao){
        this.dao = dao;
    }

    @GET
    @Timed
    public List<Club> getAllClubs(){
        return  dao.listClubs();
    }

    @POST
    @Timed
    public Club addClub(@NotNull @Valid Club club){
        // Validate abbv doesn't exist
        long existing = dao.getAbbvCount(club.getAbbreviation());
        if(existing > 0){
            throw new WebApplicationException("Club abbreviation " + club.getAbbreviation() + " already exists.", 409);
        }

        long newClubId = dao.insert(club);
        return dao.getClubById(newClubId);
    }

    @Path("/{id}")
    @GET
    @Timed
    public Club getClubById(@PathParam("id") long id){
        return dao.getClubById(id);
    }

    @Path("/{id}")
    @PUT
    @Timed
    public Club updateClubById(@PathParam("id") long id, Club club){
        // Validate ids match
        if(club.getId() != 0L && id != club.getId()){
            throw new WebApplicationException("path club id must match body club id if provided", 400);
        }

        club.setId(id);
        long resultId = dao.upsert(club);
        return dao.getClubById(resultId);
    }

    @Path("/{id}")
    @DELETE
    @Timed
    public Response deleteClubById(@PathParam("id") long id){
        dao.delete(id);
        return Response.noContent().build();
    }

    @Path("/{id}/members")
    @GET
    @Timed
    public List<Member> getClubMembers(@PathParam("id") long id){
        return dao.getClubMembers(id);
    }

    @Path("/{id}/meets")
    @GET
    @Timed
    public  List<Meet> getClubMeets(@PathParam("id") long id){
        return dao.getClubMeets(id);
    }

    @Path("/abbvreviation/{abbv}")
    @DELETE
    @Timed
    public Response deleteClubByAbbreviation(@NotEmpty @PathParam("abbv") String abbv){
        dao.delete(abbv.toUpperCase());
        return Response.noContent().build();
    }
}