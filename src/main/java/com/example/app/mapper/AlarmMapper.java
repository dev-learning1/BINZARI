package com.example.app.mapper;

import com.example.app.domain.vo.AlarmVO;
import com.example.app.domain.vo.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlarmMapper {
    //    추가(예약)
    public void insert(AlarmVO alarmVO);
    //    수정
    public void update(AlarmVO alarmVO);
    //    수정(조회할때 alarmState 컬럼만 바꾸기 위해)
    //    전체 조회할 때 updateDate 순으로 나열하는데
    //    조회할때 update()함수를 사용하면 updateDAte가 바뀜
    public void updateState(AlarmVO alarmVO);
    //    삭제
    public void delete(Long alarmNumber);
    //    조회
    public AlarmVO select(Long alarmNumber);
    //    전체 조회
    public List<AlarmVO> selectAll(Long userNumber);
    //    admin 알림 전체 조회
    public List<AlarmVO> selectAllByAdmin();
    //    안읽은 알람 전체 개수
    public int notReadTotal(Long userNumber);
}
