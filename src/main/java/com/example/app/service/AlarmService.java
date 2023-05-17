package com.example.app.service;

import com.example.app.domain.vo.*;
import com.example.app.repository.AlarmDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlarmService {
    private final AlarmDAO alarmDAO;

    // 회원가입
    public void register(AlarmVO alarmVO) { alarmDAO.save(alarmVO); }

    // 조회
    public AlarmVO show(Long alarmNumber) {
        AlarmVO alarmVO = alarmDAO.find(alarmNumber);
        alarmVO.setAlarmState(true);
        alarmDAO.setState(alarmVO);
        return alarmVO;
    }
    // 유저 알림 전체 조회
    public List<AlarmVO> showAll(Long userNumber) { return alarmDAO.findAll(userNumber); }
    // admin 알림 전체 조회
    public List<AlarmVO> showAllByAdmin() { return alarmDAO.findAllByAdmin(); }

    // 수정
    public void modify(AlarmVO alarmVO) {
        alarmVO.setAlarmState(false);
        alarmDAO.set(alarmVO);
    }

    // 삭제
    public void remove(Long alarmNumber) { alarmDAO.remove(alarmNumber); }

    // 안읽은 알림 전체 개수
    public int notReadTotal(Long userNumber) { return alarmDAO.notReadTotal(userNumber); }

}
