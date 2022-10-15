package com.example.project.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@DynamicInsert
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberId")
    private Long memberId;

    @Column(name = "memberEmail", unique = true, nullable = false)
    private String memberEmail;

    @Column(name = "memberPassword", nullable = false)
    private String memberPassword;

    @Column(name = "memberProfile")
    private String memberProfile;

}
