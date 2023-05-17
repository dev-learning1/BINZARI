package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class NoticeVO {
    // 번호
    private Long noticeNumber;
    // 공지 제목
    private String noticeTitle;
    // 공지 내용
    private String noticeContent;
    // 공지 시간
    private String noticeDate;
    // 공지 수정 시간
    private String noticeUpdateDate;
    // 공지 타입: 앱, 가게 관련 공지 분류
    private String noticeType;

//    public void create(Long userNumber, Long storeNumber, String noticeTitle, String noticeContent, String noticeType) {
//        this.userNumber = userNumber;
//        this.storeNumber = storeNumber;
//        this.noticeTitle = noticeTitle;
//        this.noticeContent = noticeContent;
//        this.noticeType = noticeType;
//    }

    public void create(String noticeTitle, String noticeContent, String noticeType) {
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
        this.noticeType = noticeType;
    }
}
