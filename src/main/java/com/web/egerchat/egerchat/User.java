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
	protected User() {

	}

	public User(int age, Long id, String userName, String gender) {
		super();
		this.age = age;
		this.id = id;
		UserName = userName;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "User [age=" + age + ", id=" + id + ", UserName=" + UserName + ", gender=" + gender + "]";
	}

}
