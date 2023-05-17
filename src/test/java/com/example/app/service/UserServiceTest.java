package com.example.app.service;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserDTO;
import com.example.app.domain.vo.UserFileVO;
import com.example.app.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@Slf4j
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    void registerUser() {
        UserVO userVO = new UserVO();
        userVO.create("사업자", "apple123@gmail.com", "apple1234", "사과", "01011112233");
        userService.registerUser(userVO);
    }

    @Test
    void showUser() { log.info("selectUser: " + userService.showUser("hgd123@gmail.com")); }


}