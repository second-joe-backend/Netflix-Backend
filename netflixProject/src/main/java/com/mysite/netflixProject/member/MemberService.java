package com.mysite.netflixProject.member;

import java.util.List;

public interface MemberService {
	public int login(MemberVO member);
	public List<MemberVO> getMembers(MemberVO vo);
	public int insertMember(MemberVO member);
	public int passwordSearch(MemberVO member);
	public int passwordUpdate(MemberVO vo);
	public int phoneUpdate(MemberVO vo);
	public int emailUpdate(MemberVO vo);
	public MemberVO selectMember(MemberVO vo);
	public int idDuplicateCheck(MemberVO vo);
	public int deleteMember(MemberVO vo);
}
