package com.mysite.netflixProject.board;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BoardMapper {
	
	@Select("select member_id, board_title, board_content, "
			+ "date_format(board_date, '%y-%m-%d') as board_date from customercenter order by board_num desc")
	public List<BoardVO> getBoardList();
	
	@Insert("insert into customercenter (member_id, board_pw, board_title, board_content) values "
			+ "(#{member_id},#{board_pw},#{board_title},#{board_content})")
	public int insertBoard(BoardVO board);
	
	@Select("select member_id, board_title, "
			+ "board_content from customercenter where board_num = #{board_num}")
	public BoardVO getDetail(BoardVO board);
	
	@Update("update customercenter set board_title=#{board_title}, board_content=#{board_content}, "
			+ "board_date=now() where board_num=#{board_num}")
	public int modifyBoard(BoardVO board);
	
	@Delete("delete from customercenter where board_num = #{board_num}")
	public int deleteBoard(BoardVO board);
}
