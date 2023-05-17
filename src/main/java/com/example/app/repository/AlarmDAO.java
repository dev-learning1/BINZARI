package com.example.app.repository;

import com.example.app.domain.vo.AlarmVO;
import com.example.app.mapper.AlarmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AlarmDAO {
    private final AlarmMapper alarmMapper;

    // 추가 save
    public void save(AlarmVO alarmVO) {
        alarmMapper.insert(alarmVO);
    }

    // 조회
    public AlarmVO find(Long alarmNumber) { return alarmMapper.select(alarmNumber); }
    // 유저 알림 전체 조회
    public List<AlarmVO> findAll(Long userNumber) { return alarmMapper.selectAll(userNumber); }
    // admin 알림 전체 조회
    public List<AlarmVO> findAllByAdmin() { return alarmMapper.selectAllByAdmin(); }

    // 정보 수정
    public void set(AlarmVO alarmVO) { alarmMapper.update(alarmVO); }
    // 수정(조회할때 alarmState 컬럼만 바꾸기 위해)
    public void setState(AlarmVO alarmVO) { alarmMapper.updateState(alarmVO); }

    //  삭제
    public void remove(Long alarmNumber) { alarmMapper.delete(alarmNumber); }

    //  안읽은 알림 전체 개수
    public int notReadTotal(Long userNumber) { return alarmMapper.notReadTotal(userNumber); }
}
