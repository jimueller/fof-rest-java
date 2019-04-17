package com.jimueller.fof.core.controllers;

import com.jimueller.fof.api.Address;
import com.jimueller.fof.api.Member;
import com.jimueller.fof.core.AddressValidator;
import com.jimueller.fof.jdbi.MemberDAO;

public class MemberController {
    private MemberDAO memberDAO;
    private AddressValidator addressValidator;

    public MemberController(MemberDAO memberDAO, AddressValidator addressValidator){
        this.memberDAO = memberDAO;
        this.addressValidator = addressValidator;
    }

    public Member addMember(Member member){
        // validate address
        Address validatedAddress = addressValidator.validate(member.getAddress());
        member.setAddress(validatedAddress);
        return memberDAO.addMember(member);
    }
}
