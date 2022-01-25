package com.company.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.app.model.UserVO;
import com.company.app.repository.UserDAO;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public int insertUser(UserVO vo) {
		return userDAO.insertUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
}
