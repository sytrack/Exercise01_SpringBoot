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
public class Kakao {

	@Id
	private Long k_number;
	private String k_nickname;
	private String k_account_email;
	private char k_gender;

}
