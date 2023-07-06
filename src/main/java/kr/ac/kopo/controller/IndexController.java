package kr.ac.kopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

@Controller
public class IndexController {
	
	@Autowired
	BoardDAO dao;
	
	@RequestMapping("/index")
	public String index(Model model) {
		List<BoardVO> postList = dao.boardView();
		
		model.addAttribute("postList", postList);
		return "index";
		
	}
	
	@RequestMapping("/aaa")
	public String testIndex(Model model) {
		
		List<BoardVO> list = dao.springBoardView();
		
		model.addAttribute("postList", list);
		
		System.out.println("template test");
		return "index";
	}
	
	@RequestMapping("image")
	public String quasar(Model model) {
		
		return "index";
	}

}
