package com.ezen.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	private String pwd;
	private String name;
	private String nick_name;
	private String gender;
	private String email;
	private String phone;
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date reg_date = new Date();

}
