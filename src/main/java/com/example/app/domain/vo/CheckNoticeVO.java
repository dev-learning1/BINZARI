package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class CheckNoticeVO {
    // 번호
    private Long checkNoticeNumber;
    // 공지 번호(fk)
    private Long noticeNumber;
    // 유저 번호(fk)
    private Long userNumber;
    // 알림 시간
    private String checkNoticeDate;
    // 알람 수정 시간
    private String checkNoticeUpdateDate;
    // 알림 읽음 상태
    private boolean checkNoticeState;

    public void create(Long noticeNumber, Long userNumber, boolean checkNoticeState) {
        this.noticeNumber = noticeNumber;
        this.userNumber = userNumber;
        this.checkNoticeState = checkNoticeState;
    }
}
