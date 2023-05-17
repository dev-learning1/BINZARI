package com.example.app.mapper;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserDTO;
import com.example.app.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //    추가
    public void insertUser(UserVO userVO);

    //    조회
    public UserVO selectUser(String userEmail);

    //    수정
    public void updateUser(UserDTO userDTO);
//    public void updateUserState(UserDTO userDTO);

    //    삭제
    public void deleteUser(String userEmail);

    //    전체 조회(admin)
    public List<UserVO> selectAllUser(Criteria criteria);
    //    전체 조회(admin)
    public List<UserVO> selectAllUserNumber();

    // admin 유저 전체 카운트
    public int selectCountAll();

}
