package com.mysite.netflixProject.board;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class BoardController {
	
	public BoardController(BoardServiceImpl impl) {
		super();
		this.impl = impl;
	}

	private BoardServiceImpl impl;
	
	@RequestMapping("/get")
	public List<BoardVO> getBoardList() {
		List<BoardVO> vo = impl.getBoardList();
		return vo;
	}

	@RequestMapping("/insert")
	public int insertBoard(BoardVO board) {
		int res = impl.insertBoard(board);
		return res;
	}

	@RequestMapping("/detail")
	public BoardVO getDetail(BoardVO board) {
		BoardVO vo = impl.getDetail(board);
		return vo;
	}

	@RequestMapping("/modify")
	public int modifyBoard(BoardVO board) {
		int res = impl.modifyBoard(board);
		return res;
	}

	@RequestMapping("/delete")
	public int deleteBoard(BoardVO board) {
		int res = impl.deleteBoard(board);
		return res;
	}
	
	

}
