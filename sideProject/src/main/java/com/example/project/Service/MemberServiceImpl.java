package com.example.project.Service;


import com.example.project.DTO.MemberDTO;
import com.example.project.Entity.MemberEntity;
import com.example.project.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    @Override
    public String test() {
        //출력 하는 구문
        MemberEntity test = memberRepository.findMemberEntityByMemberEmailAndMemberPassword("1", "1");
        return test.getMemberEmail();
    }

    @Override
    public MemberEntity testEnt() {
        return memberRepository.findMemberEntityByMemberEmailAndMemberPassword("1", "1");
    }

    @Override
    public void saveTest(MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toMemberSaveEntity(memberDTO);
        // 수정 처리를 할때 사용할 to Entity
        // MemberEntity updateMemberEntity = MemberEntity.toMemberUpdateEntity(memberDTO);
        memberRepository.save(memberEntity);
    }

}
