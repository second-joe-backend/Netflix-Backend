package com.mysite.netflixProject.board;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper mapper;

	public BoardServiceImpl(BoardMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> vo = mapper.getBoardList();
		return vo;
	}

	@Override
	public int insertBoard(BoardVO board) {
		int res = mapper.insertBoard(board);
		return res;
	}

	@Override
	public BoardVO getDetail(BoardVO board) {
		BoardVO vo = mapper.getDetail(board);
		return vo;
	}

	@Override
	public int modifyBoard(BoardVO board) {
		int res = mapper.modifyBoard(board);
		return res;
	}

	@Override
	public int deleteBoard(BoardVO board) {
		int res = mapper.deleteBoard(board);
		return res;
	}


}


