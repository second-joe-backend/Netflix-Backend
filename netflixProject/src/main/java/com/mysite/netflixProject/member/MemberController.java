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
	public int login(@RequestBody MemberVO vo) throws Exception{
		int res = memberService.login(vo);
//		System.out.println("res : "+res);
		
		return res;
	}
	
	@RequestMapping("/login")
	public int ah(@RequestBody MemberVO vo) throws Exception{
		int res = memberService.login(vo);
//		System.out.println("res : "+res);
		
		return res;
	}
	
	@RequestMapping("/insertMember")
	public int insertmember(@RequestBody MemberVO vo) throws Exception{
		int res = memberService.insertMember(vo);
		
		return res;
	}
}
