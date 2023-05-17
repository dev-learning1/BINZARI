package com.example.app.mapper;

import com.example.app.domain.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    //    추가
    public void insert(NoticeVO noticeVO);
    //    수정
    public void update(NoticeVO noticeVO);
    //    삭제
    public void delete(Long noticeNumber);
    //    조회
    public NoticeVO select(Long noticeNumber);
    //    전체 조회
}
