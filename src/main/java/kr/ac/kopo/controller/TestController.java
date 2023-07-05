package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class TestController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("testPrint");
		BoardDAO dao = new BoardDAO();
		ModelAndView mv = new ModelAndView();
		
		List<BoardVO> postList = dao.boardView();
		
		mv.addObject("postList", postList);
		
		mv.setViewName("index");
		
		return mv;
	}
}
