package com.example.app.mapper;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserDTO;
import com.example.app.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void insertUser() {
        UserVO userVO = new UserVO();
        userVO.create("사업자", "banana123@gmail.com", "banana1234", "바나나", "01098765432");
        userMapper.insertUser(userVO);
        log.info("userNumber: " + userVO.getUserNumber());
    }

    @Test
    void selectUser() { log.info("selectUser: " + userMapper.selectUser("banana123@gmail.com")); }

    @Test
    void updateUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.create(userMapper.selectUser("hgd123@gmail.com"));
//        userDTO.setUserPassword("asdf1234");
        userDTO.setUserState("휴면");
        userMapper.updateUser(userDTO);
    }

//    @Test
//    void updateUserState() {
//        UserDTO userDTO = new UserDTO();
//        userDTO.create(userMapper.selectUser("hgd123@gmail.com"));
//        userDTO.setUserState("휴면");
//        userMapper.updateUserState(userDTO);
//    }

    @Test
    void deleteUser() { userMapper.deleteUser("devlearning98@gmail.com"); }

    @Test
    void selectAllUser() { userMapper.selectAllUser(new Criteria().create(1, 10)).stream().map(UserVO::getUserNumber);}

    @Test
    void getTotal(){ log.info("getTotal : " + userMapper.selectCountAll()); }
}