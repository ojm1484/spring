package com.koreait.springmvc.model.service.notice;

import java.util.List;

import com.koreait.springmvc.domain.Notice;
import com.koreait.springmvc.model.repository.notice.NoticeDAO;

public interface NoticeService {
	//dao들을 대상으로 글쓰기 삭제 한건 가져오기 목록,, crud
	public List selectAll();
	public int insert(Notice notice);
	public Notice select(int notice_id);
	public int update(Notice notice);
	public int delete(int notice_id);

}
