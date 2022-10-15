package com.example.project.Controller;

import com.example.project.Entity.MemberEntity;
import com.example.project.Service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/test")
    public String test(Model model){
        String test = memberService.test();

        model.addAttribute("test",test);
        return "/member/test";
    }
}
