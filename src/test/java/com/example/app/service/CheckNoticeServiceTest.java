package com.example.app.service;

import com.example.app.domain.vo.NoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class CheckNoticeServiceTest {
    @Autowired
    private CheckNoticeService checkNoticeService;

//    @Test
//    void register() {
//        NoticeVO noticeVO = new NoticeVO();
//        noticeVO.create("오류 수정", "오류를 수정했습니다","앱");
//        checkNoticeService.register(noticeVO);
//    }

    @Test
    void show() { checkNoticeService.show(2L, 14L); }
    @Test
    void showAll() { checkNoticeService.showAll(2L); }

//    @Test
//    void modify() {
//        NoticeVO noticeVO = checkNoticeService.showBeforeModify(13L);
//        noticeVO.setNoticeContent("오류 다시 수정 중");
//        checkNoticeService.modify(noticeVO);
//    }

    @Test
    void notReadTotal() {
        checkNoticeService.notReadTotal(2L);
    }

//    @Test
//    void remove() { checkNoticeService.remove(13L); }

    @Test
    void remove() { checkNoticeService.remove(24L); }
}