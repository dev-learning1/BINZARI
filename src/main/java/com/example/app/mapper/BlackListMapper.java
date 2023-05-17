package com.example.app.mapper;

import com.example.app.domain.vo.BlackListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlackListMapper {
    //    추가
    public void insert(BlackListVO blackListVO);
    //    수정
    public void update(BlackListVO blackListVO);
    //    삭제
    public void delete(Long blacklistNumber);
    //    조회
    public BlackListVO select(Long blacklistNumber);
    //    전체 조회
    public List<BlackListVO> selectAll(Long userNumber);
}
