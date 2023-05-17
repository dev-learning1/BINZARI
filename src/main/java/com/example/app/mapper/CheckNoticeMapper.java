package com.example.app.mapper;

import com.example.app.domain.vo.CheckNoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CheckNoticeMapper {
    //    추가
    public void insert(CheckNoticeVO checkNoticeVO);
    //    수정
    public void update(CheckNoticeVO checkNoticeVO);
    //    삭제
    public void delete(Long checkNoticeNumber);
    //    삭제
    public void deleteAllUserWithNotice(Long NoticeNumber);
    //    조회
    public CheckNoticeVO select(Long userNumber, Long noticeNumber);
    //    해당 유저의 알림 전체 조회
    public List<CheckNoticeVO> selectAll(Long userNumber);
    //    해당 공지의 전체 조회
    public List<CheckNoticeVO> selectAllUserWithNotice(Long noticeNumber);
    //    안읽은 공지 전체 개수(해당 유저)
    public int notReadTotal(Long userNumber);
}
