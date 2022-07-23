package com.ezen.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.domain.Member;
import com.ezen.persistence.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepo;
	
	@Override
	public Member getMember(Member member) {
		Optional<Member> user = memberRepo.findById(member.getId());
		
		if (user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
	
	@Override
	public void insertMember(Member member) {
		memberRepo.save(member);
	}
	

}
