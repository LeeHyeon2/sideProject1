package com.example.project.Service;


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
        //세이브 준비
        MemberEntity save = new MemberEntity();
        save.setMemberEmail("1");
        save.setMemberPassword("1");
        // 세이브
        memberRepository.save(save);

        //출력 하는 구문
        MemberEntity test = memberRepository.findMemberEntityByMemberEmailAndMemberPassword("1", "1");
        return test.getMemberEmail();
    }
}
