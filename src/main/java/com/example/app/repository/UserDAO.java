package com.example.app.repository;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserDTO;
import com.example.app.domain.vo.UserVO;
import com.example.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    // 추가 save
    public void saveUser(UserVO userVO) {
        userMapper.insertUser(userVO);
    }

    // 로그인 시 아이디 조회
    public UserVO findUserByEmail(String userEmail) {
        return userMapper.selectUser(userEmail);
    }

    // 정보 수정
    public void setUser(UserDTO userDTO) { userMapper.updateUser(userDTO); }
//    public void setUserState(UserDTO userDTO) { userMapper.updateUserState(userDTO); }

    // admin 유저 전체 조회
    public List<UserVO> findAllUser(Criteria criteria) { return userMapper.selectAllUser(criteria); }
    // admin 유저 전체 조회
    public List<UserVO> findAllUserNumber() { return userMapper.selectAllUserNumber(); }

    //  admin 유저 삭제
    public void removeUser(String userEmail) { userMapper.deleteUser(userEmail); }

    // 유저 전체 카운트
    public int findCountAll() {
        return userMapper.selectCountAll();
    }
}
