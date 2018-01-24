package com.skilrock.bean;

import java.util.Arrays;

public class RegistrationBean {

	private String name ;
	private String gender ;
	private String address;
	private String email;
	private String[] language;
	private String languagee;
	private String phone;
	private String userId ;
	private String userpassword;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLanguage() {
		return Arrays.toString(language);
	}
	public void setLanguage(String[] language) {
		this.language = language;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public void setLanguagee(String languagee) {
		this.languagee = languagee;
	}
	public String getLanguagee() {
		return languagee;
	} 
	
	
	
}
