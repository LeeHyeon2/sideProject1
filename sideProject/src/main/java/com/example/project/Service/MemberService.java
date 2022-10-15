package com.example.project.Service;


import com.example.project.DTO.MemberDTO;
import com.example.project.Entity.MemberEntity;

public interface MemberService {
    String test();

    MemberEntity testEnt();


    void saveTest(MemberDTO memberDTO);
}
