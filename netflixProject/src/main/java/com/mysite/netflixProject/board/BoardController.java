package com.mysite.netflixProject.board;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	
	public BoardController(BoardServiceImpl impl) {
		super();
		this.impl = impl;
	}

	private BoardServiceImpl impl;
	
	public List<BoardVO> getBoardList() {
		List<BoardVO> vo = impl.getBoardList();
		return vo;
	}

	
	public int insertBoard(BoardVO board) {
		int res = impl.insertBoard(board);
		return res;
	}

	
	public BoardVO getDetail(BoardVO board) {
		BoardVO vo = impl.getDetail(board);
		return vo;
	}

	
	public int modifyBoard(BoardVO board) {
		int res = impl.modifyBoard(board);
		return res;
	}

	
	public int deleteBoard(BoardVO board) {
		int res = impl.deleteBoard(board);
		return res;
	}
	
	

}
