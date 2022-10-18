package com.example.project.Controller;

import com.example.project.DTO.MemberDTO;
import com.example.project.Entity.MemberEntity;
import com.example.project.Service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/test")
    public String test(Model model) {
        String test = memberService.test();
        MemberEntity testEn = memberService.testEnt();
        model.addAttribute("test", test);
        model.addAttribute("entity", testEn);
        return "/member/test";
    }

    @GetMapping("/saveTest")
    public String saveTest(@ModelAttribute MemberDTO memberDTO) {
        memberService.saveTest(memberDTO);
        return "/index";
    }

    @GetMapping("/signUpForm")
    public String signUpForm() {
        return "member/signUp";
    }

    @PostMapping("/signUp")
    public String signUp(MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);
        memberService.signUp(memberDTO);
        return "/index";
    }
}
