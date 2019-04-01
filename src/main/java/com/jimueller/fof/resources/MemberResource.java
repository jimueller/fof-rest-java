package com.jimueller.fof.resources;

import com.codahale.metrics.annotation.Timed;
import com.jimueller.fof.api.Member;
import com.jimueller.fof.jdbi.MemberDAO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

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
    @Operation(
            description = "Get All Members",
            responses = {
                    @ApiResponse(
                            description = "List of All Users",
                            content = @Content(
                                    mediaType = MediaType.APPLICATION_JSON,
                                    schema = @Schema(
                                            implementation = Member.class
                                    )
                            )
                    )
            }
    )
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
