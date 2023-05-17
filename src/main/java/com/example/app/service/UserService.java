package com.example.app.service;

import com.example.app.domain.vo.*;
import com.example.app.repository.CheckNoticeDAO;
import com.example.app.repository.UserDAO;
import com.example.app.repository.UserFileDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDAO;
    private final UserFileDAO userFileDAO;
    private final CheckNoticeDAO checknoticeDAO;

    // 회원가입
    public void registerUser(UserVO userVO) { userDAO.saveUser(userVO); }

    // 로그인 시 아이디 조회
    public UserDTO showUser(String userEmail) {
        UserDTO userDTO = new UserDTO();
        userDTO.create(userDAO.findUserByEmail(userEmail));
        userDTO.setUserFile(userFileDAO.findAll(userDTO.getUserNumber()));
        return userDTO;
    }

    /*// 정보 수정
    @Transactional(rollbackFor = Exception.class)
    public void modifyUser(UserDTO userDTO) {
        userDAO.setUser(userDTO);
        List<UserFileVO> userFiles = userDTO.getUserFile();

        userFileDAO.remove(userDTO.getUserNumber());

        // Optional: 검증
        // ifPresent: 앞에 있는 객체가 null이 아니라면 실행
        Optional.ofNullable(userFiles).ifPresent(userFileList -> {
            userFileList.forEach(userFile -> {
                userFile.setUserNumber(userDTO.getUserNumber());
                userFileDAO.save(userFile);
            });
        });
//        if(userFiles != null) {
//            userFiles.forEach(userFileDAO::save);
////            userFiles.forEach(userFile -> userFileDAO.save(userFile));
//        }
    }

    //    전체 조회
    public List<UserVO> showAllUser(Criteria criteria) {
        return userDAO.findAllUser(criteria);
    }

    //    삭제
    @Transactional(rollbackFor = Exception.class)
    public void removeUser(String userEmail) {
        userFileDAO.remove(userDAO.findUserByEmail(userEmail).getUserNumber());
        userDAO.removeUser(userEmail);
    }

    // 유저 전체 카운트
    public int getTotal() { return userDAO.findCountAll(); }*/


}
