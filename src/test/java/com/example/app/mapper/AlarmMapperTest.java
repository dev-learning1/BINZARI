package com.example.app.mapper;

import com.example.app.domain.vo.AlarmVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class AlarmMapperTest {
    @Autowired
    private AlarmMapper alarmMapper;

    @Test
    void insert() {
        AlarmVO alarmVO = new AlarmVO();
        alarmVO.create(8L, 2L, "예약되었습니다. 20분이 지나면 자동으로 예약이 취소됩니다.");
        alarmMapper.insert(alarmVO);
        log.info("userNumber: " + alarmVO.getAlarmNumber());
    }

    @Test
    void select() { log.info("select : " + alarmMapper.select(2L)); }

    @Test
    void update() {
        AlarmVO alarmVO = new AlarmVO();
        alarmVO = alarmMapper.select(2L);
        alarmVO.setAlarmState(true);
        alarmMapper.update(alarmVO);
    }

    @Test
    void selectAll(){ log.info("selectAllByUser : " + alarmMapper.selectAll(2L)); }
    @Test
    void selectAllByAdmin(){ log.info("selectAllByStore : " + alarmMapper.selectAllByAdmin()); }

    @Test
    void delete(){ alarmMapper.delete(2L); }

    @Test
    void notReadTotal() { log.info("notReadTotal : " + alarmMapper.notReadTotal(2L)); }

}