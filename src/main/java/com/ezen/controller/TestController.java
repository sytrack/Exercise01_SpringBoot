package com.ezen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ezen.domain.Member;
import com.ezen.service.MemberService;

@SessionAttributes("member")
@Controller
public class TestController {

	@Autowired
	private MemberService memberService;
	
	
	@GetMapping("/index")
	public void indexView() {
		
	}
	
	@GetMapping("/login")
	public void loginView() {
		
	}
	
	@GetMapping("/loginFail")
	public void loginFail() {
		
	}
	@GetMapping("/loginSuccess")
	public void loginSuccess() {
		
	}
	
	@PostMapping("/login")
	public String login(Model model, Member member) {
		
		Member loginUser = memberService.getMember(member);
		
		
		if (loginUser != null &&
				loginUser.getPwd().equals(member.getPwd())) {
			model.addAttribute("member", loginUser);
			return "redirect:loginSuccess";
		} else {
			return "redirect:loginFail";
		}	
	}
	
	@GetMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:index";
	}
	
	@GetMapping("/join")
	public void joinView() {
		
	}
	
	@PostMapping("/insertMember")
	public String insertMember(Member member) {
		memberService.insertMember(member);
		
		return "redirect:map";
	}
	
	@GetMapping("/map")
	public void mapView() {
		
	}
	
	@GetMapping("/kakaoSuccess")
	public String kakaoLogin(@RequestParam String code) throws Exception {
		System.out.println(code);
		return "redirect:kakaoSuccess";
	}
}






