package com.example.app.service;

import com.example.app.domain.vo.CheckNoticeVO;
import com.example.app.domain.vo.NoticeVO;
import com.example.app.domain.vo.UserVO;
import com.example.app.repository.CheckNoticeDAO;
import com.example.app.repository.NoticeDAO;
import com.example.app.repository.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeDAO noticeDAO;
    private final UserDAO userDAO;
    private final CheckNoticeDAO checkNoticeDAO;

    // controller에서 처리하여 의존성 낮추기
    // 공지 등록
    public void register(NoticeVO noticeVO) {
        noticeDAO.save(noticeVO);
        List<UserVO> users = userDAO.findAllUserNumber();
        for (UserVO user : users) {
            CheckNoticeVO checkNoticeVO = new CheckNoticeVO();
            checkNoticeVO.setNoticeNumber(noticeVO.getNoticeNumber());
            checkNoticeVO.setUserNumber(user.getUserNumber());
            checkNoticeVO.setCheckNoticeState(false);
            checkNoticeDAO.save(checkNoticeVO);
        }
    }

    // 조회
    public NoticeVO show(Long noticeNumber){ return noticeDAO.find(noticeNumber);}

    // controller에서 처리하여 의존성 낮추기
    // 수정
    public void modify(NoticeVO noticeVO) {
        noticeDAO.set(noticeVO);
        checkNoticeDAO.removeAllUserWithNotice(noticeVO.getNoticeNumber());

        List<UserVO> users = userDAO.findAllUserNumber();
        for (UserVO user : users) {
            CheckNoticeVO checkNoticeVO = new CheckNoticeVO();
            checkNoticeVO.setNoticeNumber(noticeVO.getNoticeNumber());
            checkNoticeVO.setUserNumber(user.getUserNumber());
            checkNoticeVO.setCheckNoticeState(false);
            checkNoticeDAO.save(checkNoticeVO);
        }
//        List<CheckNoticeVO> checkNotices = checkNoticeDAO.findAllUserWithNotice(noticeVO.getNoticeNumber());
//        for (CheckNoticeVO checkNoticeVO : checkNotices) {
//            checkNoticeVO.setCheckNoticeState(false);
//            checkNoticeDAO.set(checkNoticeVO);
//        }
    }

    // 공지 삭제
    public void remove(Long noticeNumber) {
        checkNoticeDAO.removeAllUserWithNotice(noticeNumber);
        noticeDAO.remove(noticeNumber);
    }



//    // 조회
//    public NoticeVO show(Long userNumber, Long noticeNumber) {
//        CheckNoticeVO checkNoticeVO = checkNoticeDAO.find(userNumber, noticeNumber);
//        checkNoticeVO.setCheckNoticeState(true);
//        checkNoticeDAO.set(checkNoticeVO);
//        return noticeDAO.find(noticeNumber);
//    }
//    // 해당 유저 알림 전체 조회
//    public List<NoticeVO> showAllByUser(Long userNumber) {
//        List<CheckNoticeVO> checkNoticeVOList = checkNoticeDAO.findAll(userNumber);
//        List<NoticeVO> noticeVOList = new ArrayList<>();
//        for (CheckNoticeVO checkNoticeVO : checkNoticeVOList) {
//            noticeVOList.add(noticeDAO.find(checkNoticeVO.getNoticeNumber()));
//        }
//        return noticeVOList;
//    }

//    // 해당 유저 공지 삭제
//    public void removeCheckNotice(Long checkNoticeNumber) { checkNoticeDAO.remove(checkNoticeNumber); }

//    // 안읽은 알림 전체 개수
//    public int notReadTotal(Long userNumber) { return checkNoticeDAO.notReadTotal(userNumber); }

}
