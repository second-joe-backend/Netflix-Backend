package com.mysite.netflixProject.member;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface MemberMapper {
	@Select("select count(*) from member where member_id=#{member_id} and pw=#{member_pw}")
	public int login(MemberVO member);
	
	@Insert("insert into board_tbl (member_id, member_pw, member_name, member_tel, member_addr, pw_question, pw_answer) "
			+ "values (#{member_id}, #{member_pw}, #{member_name}, #{member_tel}, #{member_addr}, #{pw_question}, #{pw_answer})")
	public int insertMember(MemberVO member);
	
	@Select("select * from member where member_id=#{member_id} and pw_question=#{pw_question} and pw_answer=#{pw_answer}")
	public MemberVO passwordSearch(MemberVO member);
}
