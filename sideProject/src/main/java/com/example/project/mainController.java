package com.example.project;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class mainController {

    private final mainRepository mainRepository;
    @GetMapping("/")
    public String index(Model model) {
        testEntity testEntity = mainRepository.findById(1l).get();
        String name = testEntity.getName();
        model.addAttribute("name",name);
        return "/index";
    }
}
