package com.jimueller.fof.resources;

import com.codahale.metrics.annotation.Timed;
import com.jimueller.fof.api.Club;
import com.jimueller.fof.jdbi.ClubDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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

    @Path("/club/{id}")
    @GET
    @Timed
    public Club getClubById(@PathParam("id") int id){
        return dao.getClubById(id);
    }
}

/*

@Path("/bookings")
public class BookingResource {
    private BookingDao dao;

    public BookingResource(BookingDao dao) {
        this.dao = dao;
    }

    @GET
    @Timed
    public List<Booking> getAllBookings() {
        return dao.fetchAllBookings();
    }

    @Path("/booking/{id}")
    @GET
    @Timed
    public Booking getBookingById(@PathParam("id") int id) {
        return dao.getBookingById(id);
    }
}

 */