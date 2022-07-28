package com.ezen.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Member {

	@Id
	private String id;
	private String name;
	private String nickname;
	private String pwd;
	private String email;
	private char gender;
	private String address_name;
	private String address_detail;
	private String phone;

}
