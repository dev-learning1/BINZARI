package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class AlarmVO {
    // 번호
    private Long alarmNumber;
    // 유저 번호(fk)
    private Long userNumber;
    // 예약 번호(fk)
    private Long reservationNumber;
    // 알림 내용
    private String alarmContent;
    // 알림 시간
    private String alarmDate;
    // 알람 수정 시간
    private String alarmUpdateDate;
    // 알림 읽음 상태
    private boolean alarmState;

    public void create(Long userNumber, Long reservationNumber, String alarmContent) {
        this.userNumber = userNumber;
        this.reservationNumber = reservationNumber;
        this.alarmContent = alarmContent;
    }
}
