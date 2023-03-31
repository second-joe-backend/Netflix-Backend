package com.mysite.netflixProject.board;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int board_num;
	private String member_id;
	private String board_pw;
	private String board_title;
	private String board_content;
	private Date board_date;
}
