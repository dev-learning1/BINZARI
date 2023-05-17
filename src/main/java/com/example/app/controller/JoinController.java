package com.example.app.controller;

import com.example.app.domain.vo.UserVO;
import com.example.app.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;

public class JoinController {
    private UserService userService;

    // 일반 정보 추가
    @PostMapping("/join")
    public String joinUser(UserVO userVO) {
        userService.registerUser(userVO);
        return "/login/login";
    }
}
