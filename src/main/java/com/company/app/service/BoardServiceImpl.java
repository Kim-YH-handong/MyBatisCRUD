package com.company.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.model.BoardVO;
import com.company.app.repository.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public int insertBoard(BoardVO vo) {
		return boardDAO.insertBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		return boardDAO.updateBoard(vo);
	}

	@Override
	public int deleteBoard(int id) {
		return boardDAO.deleteBoard(id);
	}

	@Override
	public BoardVO getBoard(int id) {
		return boardDAO.getBoard(id);
	}

	@Override
	public List<BoardVO> listBoard() {
		return boardDAO.listBoard();
	}
}
