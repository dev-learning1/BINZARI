package com.example.app.repository;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserDTO;
import com.example.app.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UserDAOTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    void saveUser() {
        UserVO userVO = new UserVO();
        userVO.create("개인", "strawberry123@gmail.com", "strawberry1234", "딸기", "01011112222");
        userDAO.saveUser(userVO);
    }

    @Test
    void findUserByEmail() { log.info("selectUser: " + userDAO.findUserByEmail("strawberry123@gmail.com")); }

    @Test
    void setUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.create(userDAO.findUserByEmail("hgd123@gmail.com"));
//        userDTO.setUserPassword("asdf1234");
        userDTO.setUserState("블랙");
        userDAO.setUser(userDTO);
    }

//    @Test
//    void setUserState() {
//        UserDTO userDTO = new UserDTO();
//        userDTO.create(userDAO.findUserByEmail("hgd123@gmail.com"));
//        userDTO.setUserState("블랙");
//        userDAO.setUserState(userDTO);
//    }

    @Test
    void findAllUser() { userDAO.findAllUser(new Criteria().create(1, 10)).stream().map(UserVO::getUserNumber);}

    @Test
    void removeUser() { userDAO.removeUser("strawberry123@gmail.com"); }

    @Test
    void findCountAll() { userDAO.findCountAll(); }
}