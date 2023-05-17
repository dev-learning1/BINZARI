package com.example.app.mapper;

import com.example.app.domain.vo.BlackListVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class BlackListMapperTest {
    @Autowired
    private BlackListMapper blackListMapper;

    @Test
    void insert() {
        BlackListVO blackListVO = new BlackListVO();
        blackListVO.create(3L, 8L, "진상");
        blackListMapper.insert(blackListVO);
    }

    @Test
    void update() {
        BlackListVO blackListVO = new BlackListVO();
        blackListVO = blackListMapper.select(2L);
        blackListVO.setBlacklistReason("진상");
        blackListMapper.update(blackListVO);
    }

    @Test
    void delete() { blackListMapper.delete(4L);}

    @Test
    void selectAll() { blackListMapper.selectAll(3L); }
}