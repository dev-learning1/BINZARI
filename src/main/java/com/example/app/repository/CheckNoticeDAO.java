package com.example.app.repository;

import com.example.app.domain.vo.CheckNoticeVO;
import com.example.app.mapper.CheckNoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CheckNoticeDAO {
    private final CheckNoticeMapper checkNoticeMapper;

    // 추가 save
    public void save(CheckNoticeVO checkNoticeVO) {
        checkNoticeMapper.insert(checkNoticeVO);
    }

    // 조회
    public CheckNoticeVO find(Long userNumber, Long noticeNumber) {
        return checkNoticeMapper.select(userNumber, noticeNumber);
    }
    // 해당 유저 공지 전체 조회
    public List<CheckNoticeVO> findAll(Long userNumber) { return checkNoticeMapper.selectAll(userNumber); }
    // 해당 공지 유저 전체 조회
    public List<CheckNoticeVO> findAllUserWithNotice(Long noticeNumber) { return checkNoticeMapper.selectAllUserWithNotice(noticeNumber); }

    // 정보 수정
    public void set(CheckNoticeVO checkNoticeVO) { checkNoticeMapper.update(checkNoticeVO); }

    //  삭제
    public void remove(Long checkNoticeNumber) { checkNoticeMapper.delete(checkNoticeNumber); }
    //  해당 공지 모든 유저 삭제
    public void removeAllUserWithNotice(Long NoticeNumber) { checkNoticeMapper.deleteAllUserWithNotice(NoticeNumber); }

    //  안읽은 알림 전체 개수
    public int notReadTotal(Long userNumber) { return checkNoticeMapper.notReadTotal(userNumber); }
}
