package com.koreait.springmvc.model.service.notice;

import java.util.List;

import com.koreait.springmvc.domain.Notice;
import com.koreait.springmvc.model.repository.notice.NoticeDAO;

public class NoticeServiceImpl implements NoticeService{
	//dao에게 일 시키기 위해 dao를 has a로 보유하자
	//하지만 보유는 하되 느슨하게 결합도를 낮춰서 보유하자
	private NoticeDAO noticeDAO;
	
	//외부의 컨테이너로 하여금 noticeDAO의 인스턴스를 주입받기 위해 세터를 준비해놓자
	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}
	
	public List selectAll() {
		return noticeDAO.selectAll();
	}

	public int insert(Notice notice) {
		return noticeDAO.insert(notice);
	}

	public Notice select(int notice_id) {
		return null;
	}

	public int update(Notice notice) {
		return 0;
	}

	public int delete(int notice_id) {
		return 0;
	}

}
