package com.example.app.mapper;

import com.example.app.domain.vo.NoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class NoticeMapperTest {
    @Autowired
    private NoticeMapper noticeMapper;

    @Test
    void insert() {
        NoticeVO noticeVO = new NoticeVO();
//        noticeVO.create(2L, 1L, "해당가게에 진상짓을 하여 블랙리스트가 되었습니다. 예약하는 것에 제한이됩니다.", "블랙리스트");
        noticeVO.create("PC방 오픈","PC방이 새로 단장하였습니다. 많은 이용 바랍니다.", "가게");
        noticeMapper.insert(noticeVO);
    }
}