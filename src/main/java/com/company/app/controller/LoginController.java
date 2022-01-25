package com.company.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.app.model.UserVO;
import com.company.app.repository.UserDAO;
import com.company.app.service.UserServiceImpl;

@Service
public class LoginController {

		@Autowired
		UserServiceImpl service;
		
		@RequestMapping(value="/login", method = RequestMethod.GET)
		public String userLogin() {
			return "board/login";
		}
		
		@RequestMapping(value="/login/loginok", method = RequestMethod.POST)
		public String insertUser(UserVO vo) {
			int i = service.insertUser(vo);
			if (i==0)
				System.out.println("데이터 추가 실패");
			else
				System.out.println("데이터 추가 성공!!!");
			return "board/list";
		}
		
		@RequestMapping(value="/login/logincheck", method = RequestMethod.POST)
		public String checkUser(UserVO vo, HttpSession session) {
			UserVO checkVO = service.getUser(vo);
			if(checkVO != null) {
				System.out.println("로그인 성공!");
				session.setAttribute("login", checkVO);
				return "board/list";
			}
			System.out.println("로그인 실패!");
			return "board/login";
		}
}
