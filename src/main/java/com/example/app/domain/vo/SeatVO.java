package com.example.app.domain.vo;

public class SeatVO {
    // 번호
    private Long seatNumber;
    // 가게 번호(fk)
    private Long storeNumber;
    // 자리 상태(비어있음, 이용중, 없음)
    private String seatAvailable;
}
