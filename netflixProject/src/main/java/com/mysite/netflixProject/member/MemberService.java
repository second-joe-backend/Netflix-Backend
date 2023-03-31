package com.mysite.netflixProject.member;

public interface MemberService {
	public int login(MemberVO member);
	public int insertMember(MemberVO member);
	public int passwordSearch(MemberVO member);
}
