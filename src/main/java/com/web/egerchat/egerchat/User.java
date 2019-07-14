package com.web.egerchat.egerchat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Chrisphine
 *
 */
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String UserName;
	private String gender;
	private int age;
	private String secq;
	protected User() {

	}
	public User(Long id, String userName, String gender, int age, String secq) {
		super();
		this.id = id;
		UserName = userName;
		this.gender = gender;
		this.age = age;
		this.secq = secq;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSecq() {
		return secq;
	}
	public void setSecq(String secq) {
		this.secq = secq;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", UserName=" + UserName + ", gender=" + gender + ", age=" + age + ", secq=" + secq
				+ "]";
	}


}
