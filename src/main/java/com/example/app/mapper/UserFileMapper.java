package com.example.app.mapper;

import com.example.app.domain.vo.UserFileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserFileMapper {
    //    파일 추가
    public void insert(UserFileVO userFileVO);

    //    파일 삭제
    public void delete(Number userNumber);

    //    파일 조회
    public List<UserFileVO> selectAll(Number userNumber);

    //    지난 날 파일 조회
    public List<UserFileVO> selectOld();
}
