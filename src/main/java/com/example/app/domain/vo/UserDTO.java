package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class UserDTO {
    //   유저 번호
    private Long userNumber;
    //   유저 유형: 관리자, 사용자, 기업인
    private String userType;
    //   유저 이메일
    private String userEmail;
    //   유저 비밀번호
    private String userPassword;
    //   유저 이름
    private String userName;
    //   유저 폰번호
    private String userPhonenum;
    //   유저 상태: 정상, 탈퇴, 휴면, 블랙
    private String userState;
    //   유저 닉네임
    private String userNickname;
    //   프로필 사진
    private List<UserFileVO> userFile;

    public void create(UserVO userVO) {
        this.userNumber = userVO.getUserNumber();
        this.userType = userVO.getUserType();
        this.userEmail = userVO.getUserEmail();
        this.userPassword = userVO.getUserPassword();
        this.userName = userVO.getUserName();
        this.userPhonenum = userVO.getUserPhonenum();
        this.userState = userVO.getUserState();
        this.userNickname = userVO.getUserNickname();
    }

    public void create(UserVO userVO, List<UserFileVO> userFile) {
        this.userNumber = userVO.getUserNumber();
        this.userType = userVO.getUserType();
        this.userEmail = userVO.getUserEmail();
        this.userPassword = userVO.getUserPassword();
        this.userName = userVO.getUserName();
        this.userPhonenum = userVO.getUserPhonenum();
        this.userState = userVO.getUserState();
        this.userNickname = userVO.getUserNickname();
        this.userFile = userFile;
    }

    public void create(String userType, String userEmail, String userPassword, String userName, String userPhonenum) {
        this.userType = userType;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userPhonenum = userPhonenum;
    }

}
