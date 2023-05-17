package com.example.app.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserFileVO {
    // 번호
    private Long userFileNumber;
    // 이름
    private String userFileName;
    // 경로
    private String userFileUploadPath;
    // uuid
    private String userFileUuid;
    // 확장자 체크
    private boolean userFileImageCheck;
    // 크기
    private int userFileSize;
    // 유저 번호(fk)
    private Long userNumber;

    public void create(String userFileName, String userFileUploadPath, String userFileUuid, boolean userFileImageCheck) {
        this.userFileName = userFileName;
        this.userFileUploadPath = userFileUploadPath;
        this.userFileUuid = userFileUuid;
        this.userFileImageCheck = userFileImageCheck;
    }
}
