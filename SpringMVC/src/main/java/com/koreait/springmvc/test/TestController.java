package com.koreait.springmvc.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//테스트 요청을 처리하는 컨트롤러
public class TestController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//3단계 일시키기
		//4단계 결과가 있다면 결과 저장
		
		//Model: 결과 데이터를 담는 객체
		//View: 결과 뷰 페이지 정보를 가진 객체
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("msg","스프링에서 담은 정보"); //=request.setAttribute("msg","스프링에서 담은 정보");
		mav.setViewName("main/result");
		
		return mav;
	}
	
}
