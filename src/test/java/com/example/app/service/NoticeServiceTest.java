package com.example.app.service;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.NoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class NoticeServiceTest {
    @Autowired
    private NoticeService noticeService;

    @Test
    void register() {
        NoticeVO noticeVO = new NoticeVO();
        noticeVO.create("오류 수정", "오류를 수정했습니다","앱");
        noticeService.register(noticeVO);
    }

//    @Test
//    void show() { noticeService.show(2L, 13L); }
//    @Test
//    void showAllByUser() { noticeService.showAllByUser(2L); }

    @Test
    void modify() {
        NoticeVO noticeVO = noticeService.show(13L);
        noticeVO.setNoticeContent("오류 다시 수정 중");
        noticeService.modify(noticeVO);
    }

//    @Test
//    void notReadTotal() {
//        noticeService.notReadTotal(2L);
//    }

    @Test
    void remove() { noticeService.remove(13L); }

//    @Test
//    void removeCheckNotice() { noticeService.removeCheckNotice(11L); }
}