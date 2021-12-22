package com.koreait.springmvc.model.repository.notice;

import java.util.List;

import com.koreait.springmvc.domain.Notice;

//가장 상단의 DAO . 결합도를 낮추기 위해/ 모든 dao를 구현할 상위 dao정의 
public interface NoticeDAO {
	public List selectAll();
	public int insert(Notice notice);
	public Notice select(int notice_id);
	public int update(Notice notice);
	public int delete(int notice_id);
}
