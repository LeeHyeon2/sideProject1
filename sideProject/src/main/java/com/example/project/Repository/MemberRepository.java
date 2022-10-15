package com.example.project.Repository;


import com.example.project.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {
    MemberEntity findMemberEntityByMemberEmailAndMemberPassword(String email , String password);
}
