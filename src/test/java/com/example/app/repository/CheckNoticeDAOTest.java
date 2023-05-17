package com.example.app.repository;

import com.example.app.domain.vo.CheckNoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CheckNoticeDAOTest {
    @Autowired
    private CheckNoticeDAO checkNoticeDAO;

//    @Test
//    void find() {
//        checkNoticeDAO.find(11L);
//    }
    @Test
    void findAllUserWithNotice() {
        log.info("checkNotice:" + checkNoticeDAO.findAllUserWithNotice(11L));
    }
    @Test
    void findAll() {
        log.info("checkNotice:" + checkNoticeDAO.findAll(2L));
    }
    @Test
    void find() {
        log.info("checkNotice:" + checkNoticeDAO.find(2L, 14L));
    }

//    @Test
//    void set() {
//        CheckNoticeVO checkNoticeVO = checkNoticeDAO.find(11L);
//        checkNoticeVO.setCheckNoticeState(false);
//        checkNoticeDAO.set(checkNoticeVO);
//    }
}