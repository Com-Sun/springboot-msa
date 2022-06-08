package com.nhnacademy.board.controller;

import com.nhnacademy.board.domain.dto.request.LoginRequestDto;
import com.nhnacademy.board.service.MemberService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = {"/", "/login"})
    public String login() {
        return "loginForm";
    }

    @PostMapping(value = "/login")
    public String login(LoginRequestDto loginRequest, HttpServletRequest httpServletRequest, Model model) {
        if (memberService.matches(loginRequest)) {
            HttpSession httpSession = httpServletRequest.getSession(true);
            httpSession.setAttribute("id", loginRequest.getMemberId());
            model.addAttribute("id", loginRequest.getMemberId());
            return "redirect:/board";
        }
        return "redirect:/login";
    }

}
