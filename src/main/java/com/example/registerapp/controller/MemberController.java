package com.example.registerapp.controller;

import com.example.registerapp.entity.Member;
import com.example.registerapp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    // Show the registration form
    @GetMapping("/register")
    public String showRegisterForm() {
        return "register"; // Returns the Thymeleaf template
    }

    // Handle the form submission and register the member
    @PostMapping("/register")
    public String registerMember(@RequestParam String name, @RequestParam String email, Model model) {
        Member member = new Member();
        member.setName(name);
        member.setEmail(email);

        // Register the member by saving it to the database
        memberService.registerMember(member);

        // Add a success message to the model
        model.addAttribute("message", "Member registered successfully!");
        return "register"; // Return to the register page
    }
}
