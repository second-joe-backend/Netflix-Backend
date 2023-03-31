package com.mysite.netflixProject.board;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl {
	
	private BoardMapper mapper;

	public BoardServiceImpl(BoardMapper mapper) {
		super();
		this.mapper = mapper;
	}


}


