package com.company.app.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.app.model.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int insertBoard(BoardVO vo) {
		return sqlSession.insert("Board.insertBoard", vo);
	}
	
	public int updateBoard(BoardVO vo) {
		return sqlSession.update("Board.updateBoard", vo);
	}
	
	public int deleteBoard(int id) {
		return sqlSession.delete("Board.deleteBoard", id);
	}
	
	public BoardVO getBoard(int id) {
		return sqlSession.selectOne("Board.getBoard", id);
	}
	
	public List<BoardVO> listBoard() {
		return sqlSession.selectList("Board.listBoard");
	}
}
