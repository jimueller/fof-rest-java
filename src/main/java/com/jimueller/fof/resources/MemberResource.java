package com.jimueller.fof.resources;

import com.codahale.metrics.annotation.Timed;
import com.jimueller.fof.api.Member;
import com.jimueller.fof.jdbi.MemberDAO;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("members")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MemberResource {
    private MemberDAO memberDAO;

    public MemberResource(MemberDAO dao){
        this.memberDAO = dao;
    }

    @GET
    @Timed
    public List<Member> fetchAllMembers(){
        return memberDAO.listMembers();
    }

    @POST
    @Timed
    public Member addMember(@NotNull @Valid Member member){

        return member;
    }

    @Path("/{id}")
    @GET
    @Timed
    public Member getMemberById(@PathParam("id") int id){
        return memberDAO.getMemberById(id);
    }
}
