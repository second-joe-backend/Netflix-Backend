package com.mysite.netflixProject.member;

import org.springframework.web.bind.annotation.RequestBody;

public interface MemberService {
	public int login(MemberVO member);
	public int insertMember(MemberVO member);
	public int passwordSearch(MemberVO member);
	public int passwordUpdate(MemberVO vo);
	public int idDuplicateCheck(MemberVO vo);
}
