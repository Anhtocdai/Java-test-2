package com.laptrinhjavaweb.model;

import com.google.gson.Gson;

public class UserModel {
	private String userName;
	private String pass;
	private String name;
	private String bob;
	private String address;
	private String gender;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBob() {
		return bob;
	}

	public void setBob(String bob) {
		this.bob = bob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String make_JSON() {
		Gson x = new Gson();
		return x.toJson(this);
	}
	
	public UserModel() {
		
	}
	public UserModel(String a, String b, String c, String d, String e, String f) {
		userName = a; pass = b; name = c; bob = d; address = e; gender = f; 
	}
	

}
