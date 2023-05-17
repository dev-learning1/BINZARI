package com.example.app.domain.vo;

public class ReservationVO {
    // 번호
    private Long reservationNumber;
    // 가게 번호(fk)
    private Long storeNumber;
    // 유저 번호(fk)
    private Long userNumber;
    // 예약 등록 시간
    private String reservationStartDate;
    // 예약 수정 시간
    private String reservationUpdateDate;
    // 예약 시작 시간
    private String reservationDate;
    // 예약 자리
    private int reservationSeat;
}
