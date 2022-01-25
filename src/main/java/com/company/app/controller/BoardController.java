package com.company.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.app.model.BoardVO;
import com.company.app.service.BoardServiceImpl;

@Controller
public class BoardController {
	
	@Autowired
	BoardServiceImpl service;

	@RequestMapping(value="/board/list", method = RequestMethod.GET)
	public String boardList(Model model) {
		model.addAttribute("list", service.listBoard());
		return "board/list";
	}
	
	@RequestMapping(value="board/add", method = RequestMethod.GET)
	public String addBoard(BoardVO vo) {
		return "board/addpostform";
	}
	
	@RequestMapping(value="board/addok", method = RequestMethod.POST)
	public String addBoardOk(BoardVO vo) {
		int i = service.insertBoard(vo);
		if (i==0)
			System.out.println("데이터 추가 실패");
		else
			System.out.println("데이터 추가 성공!!!");
		return "redirect:list";
	}
	
	@RequestMapping(value="board/editform/{id}", method = RequestMethod.GET)
	public String editBoard(@PathVariable("id") int id, Model model) {
		BoardVO boardVO = service.getBoard(id);
		model.addAttribute("boardVO", boardVO);
		return "board/editform";
	}
	
	@RequestMapping(value = "/board/editok", method = RequestMethod.POST)
	public String editPostOk(BoardVO vo) {
		int i = service.updateBoard(vo);
		if(i==0)
			System.out.println("데이터 수정 실패");
		else
			System.out.println("데이터 수정 성공!!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/board/deleteok/{id}", method = RequestMethod.GET)
	public String deletePostOk(@PathVariable("id") int id, Model model) {
		service.deleteBoard(id);
		return "redirect:../list";
	}
}