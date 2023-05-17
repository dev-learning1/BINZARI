package com.example.app.controller;

import com.example.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/login/*")
public class LoginController {
    // 로그인/회원가입 창 페이지
    @GetMapping("/login")
    public void login(Model model) {
        model.addAttribute("userInfo", new UserVO());
    }
}
