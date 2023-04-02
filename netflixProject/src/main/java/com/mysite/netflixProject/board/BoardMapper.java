package com.mysite.netflixProject.board;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface BoardMapper {
	
	@Select("select board_num, member_id, board_title, board_content, "
			+ "date_format(board_date, '%m월 %d일 %H시') as board_date from customercenter order by board_num asc")
	public List<BoardVO> getBoardList();
	
	@Update("set @cnt=0;")
	public void counterset();
	
	@Update("update customercenter"
			+ " set board_num = (@cnt := @cnt + 1)"
			+ " where board_num"
			+ " order by board_date DESC;")
	public void counterset2();
	
	@Insert("insert into customercenter (member_id, board_title, board_content, board_num) values "
			+ "(#{member_id},#{board_title},#{board_content},1)")
	public int insertBoard(BoardVO board);
	
	@Select("select member_id, board_title, "
			+ "board_content from customercenter where board_num = #{board_num}")
	public BoardVO getDetail(BoardVO board);
	
	@Update("update customercenter set board_title=#{board_title}, board_content=#{board_content} "
			+ " where board_num=#{board_num}")
	public int modifyBoard(BoardVO board);
	
	@Delete("delete from customercenter where board_num=#{board_num}")
	public int deleteBoard(BoardVO board);
}
