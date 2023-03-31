package com.mysite.netflixProject.member;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {
	private MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@RequestMapping("/login")
	public int login( MemberVO vo) throws Exception{
		int res = memberService.login(vo);
//		System.out.println("res : "+res);
		
		return res;
	}

	
	@RequestMapping("/insertMember")
	public int insertmember(MemberVO vo) throws Exception{
		int res = memberService.insertMember(vo);
		
		return res;
	}
	
	@RequestMapping("/passwordSearch")
	public int passwordSearch(MemberVO vo) throws Exception{
		int res = memberService.passwordSearch(vo);
		
		return res;
	}
	
	@RequestMapping("/passwordUpdate")
	public int passwordUpdate(MemberVO vo) throws Exception{
		int res = memberService.passwordUpdate(vo);
		
		return res;
	}
	
	
	@RequestMapping("/phoneUpdate")
	public int phoneUpdate(MemberVO vo) throws Exception{
		int res = memberService.phoneUpdate(vo);
		
		return res;
	}
	
	@RequestMapping("/emailUpdate")
	public int emailUpdate( MemberVO vo) throws Exception{
		int res = memberService.emailUpdate(vo);
		
		return res;
	}
	
	@RequestMapping("/selectMember")
	public MemberVO selectMember( MemberVO vo) throws Exception{
		MemberVO selectedMember = memberService.selectMember(vo);
		
		return selectedMember;
	}
	@RequestMapping("/idDuplicateCheck")
	public int idDuplicateCheck( MemberVO vo) throws Exception{
		int res = memberService.idDuplicateCheck(vo);
		
		return res;
	}
	
	
	
}
