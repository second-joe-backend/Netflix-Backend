package com.mysite.netflixProject.member;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface MemberMapper {
	@Select("select * from member order by member_num")
	public List<MemberVO> getMembers(MemberVO member);
	
	@Select("select count(*) from member where member_id=#{member_id} and member_pw=#{member_pw}")
	public int login(MemberVO member);
	
	@Insert("insert into member (member_num, member_id, member_pw, member_name, member_tel, member_addr, pw_question, pw_answer) "
			+ "values (1, #{member_id}, #{member_pw}, #{member_name}, #{member_tel}, #{member_addr}, #{pw_question}, #{pw_answer})")
	public int insertMember(MemberVO member);
	
	@Select("select count(*) from member where member_id=#{member_id} and pw_question=#{pw_question} and pw_answer=#{pw_answer}")
	public int passwordSearch(MemberVO member);
	
	@Update("update member set member_pw=#{member_pw} where member_id=#{member_id}")
	public int passwordUpdate(MemberVO vo);
	
	@Update("update member set member_id=#{member_new_id} where member_id=#{member_id}")
	public int emailUpdate(MemberVO vo);
	
	@Update("update member set member_tel=#{member_tel} where member_id=#{member_id}")
	public int phoneUpdate(MemberVO vo);
	
	@Select("select count(*) from member where member_id=#{member_id}")
	public int idDuplicateCheck(MemberVO vo);
	
	@Select("select * from member where member_id=#{member_id}")
	public MemberVO selectMember(MemberVO vo);
	
	@Delete("delete from member where member_id=#{member_id}")
	public int deleteMember(MemberVO vo);
	
	@Update("set @cnt=0;")
	public void counterset();
	
	@Update("update member"
			+ " set member_num = (@cnt := @cnt + 1)"
			+ " where member_num"
			+ " order by member_num DESC;")
	public void counterset2();
}
