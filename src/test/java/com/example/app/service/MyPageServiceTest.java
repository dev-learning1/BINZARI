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

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MyPageServiceTest {
    @Autowired
    private MyPageService myPageService;

    @Test
    void modifyUser() {
        UserDTO userDTO = myPageService.showUser("apple123@gmail.com");
        UserFileVO userFileVO = new UserFileVO();

        userFileVO.create("사과 사진", "2023/03/08", UUID.randomUUID().toString(), true);

        List<UserFileVO> userFile = new ArrayList<>(Arrays.asList(userFileVO));

//        userDTO.create(userService.showUser("hgd123@gmail.com"));
//        userDTO.setUserPassword("hgd1234");
        userDTO.setUserFile(userFile);
        userDTO.setUserNickname("사과는 맛있어");
        myPageService.modifyUser(userDTO);
    }

//    @Test
//    void modifyUserState() {
//        UserDTO userDTO = new UserDTO();
//        userDTO.create(userService.showUser("hgd123@gmail.com"));
//        userDTO.setUserState("정상");
//        userService.modifyUserState(userDTO);
//    }

    @Test
    void showAllUser() { myPageService.showAllUser(new Criteria().create(1, 10)).stream().map(UserVO::getUserNumber);}

    @Test
    void removeUser() {
        myPageService.removeUser("strawberry123@gmail.com"); }

    @Test
    void getTotal() { myPageService.getTotal(); }
}