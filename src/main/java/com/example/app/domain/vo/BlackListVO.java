package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class BlackListVO {
    // 번호
    private Long blacklistNumber;
    // 블랙리스트 작성한 유저 혹은 사업자 번호(fk)
    private Long userNumber;
    // 블랙리스트 당한 유저 혹은 사업자 번호(fk)
    private Long blacklistUserNumber;
    // 사유
    private String blacklistReason;
    // 등록 날짜
    private String blacklistRegisterDate;
    // 수정 날짜
    private String blacklistUpdateDate;
    // 고객블랙리스트, 가게블랙리스트 구분
    private String blacklistType;

    public void create(Long userNumber, Long blacklistUserNumber, String blacklistReason) {
        this.userNumber = userNumber;
        this.blacklistUserNumber = blacklistUserNumber;
        this.blacklistReason = blacklistReason;
    }
}
