package com.company.app.service;

import com.company.app.model.UserVO;

public interface UserService {
	public int insertUser(UserVO vo);
	public UserVO getUser(UserVO vo);
}
