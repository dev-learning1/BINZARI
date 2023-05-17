package com.example.app.repository;

import com.example.app.domain.vo.UserFileVO;
import com.example.app.mapper.UserFileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserFileDAO {
    private final UserFileMapper userFileMapper;

    //    파일 추가
    public void save(UserFileVO userFileVO) {
        userFileMapper.insert(userFileVO);
    }

    //    파일 삭제
    public void remove(Number userNumber) {
        userFileMapper.delete(userNumber);
    }

    //    파일 조회
    public List<UserFileVO> findAll(Number userNumber) {
        return userFileMapper.selectAll(userNumber);
    }

    //    지난 날 파일 조회
    public List<UserFileVO> findOld() {
        return userFileMapper.selectOld();
    }
}
