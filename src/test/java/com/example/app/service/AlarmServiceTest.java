package com.example.app.service;

import com.example.app.domain.vo.AlarmVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class AlarmServiceTest {
    @Autowired
    private AlarmService alarmService;

    @Test
    void register() {
        AlarmVO alarmVO = new AlarmVO();
        alarmVO.create(2L, 1L, "예약되었습니다. 20분이 지나면 자동으로 예약이 취소됩니다.");
        alarmService.register(alarmVO);
    }

    @Test
    void show() { log.info("show : " + alarmService.show(4L)); }

    @Test
    void showAll() { alarmService.showAll(2L); }

    @Test
    void showAllByAdmin() { alarmService.showAllByAdmin();}

    @Test
    void modify() {
        AlarmVO alarmVO = alarmService.show(3L);
        alarmVO.setAlarmContent("예약시간 3분전 입니다.");
        alarmService.modify(alarmVO);
    }

    @Test
    void remove() { alarmService.remove(3L);}

    @Test
    void notReadTotal() { alarmService.notReadTotal(2L); }
}