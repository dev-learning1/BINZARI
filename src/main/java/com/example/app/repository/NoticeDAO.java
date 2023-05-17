package com.example.app.repository;

import com.example.app.domain.vo.NoticeVO;
import com.example.app.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeDAO {
    private final NoticeMapper noticeMapper;

    // 추가 save
    public void save(NoticeVO noticeVO) { noticeMapper.insert(noticeVO); }

    // 조회
    public NoticeVO find(Long noticeNumber) { return noticeMapper.select(noticeNumber); }

    // 정보 수정
    public void set(NoticeVO noticeVO) { noticeMapper.update(noticeVO); }

    //  삭제
    public void remove(Long noticeNumber) { noticeMapper.delete(noticeNumber); }
}
