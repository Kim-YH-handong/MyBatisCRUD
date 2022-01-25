package com.company.app.service;

import java.util.List;

import com.company.app.model.BoardVO;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public int updateBoard(BoardVO vo);
	public int deleteBoard(int id);
	public BoardVO getBoard(int id);
	public List<BoardVO> listBoard();
}
