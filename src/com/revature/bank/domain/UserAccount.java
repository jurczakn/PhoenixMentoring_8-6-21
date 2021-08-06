package com.revature.bank.domain;

public class UserAccount {

	private String username;

	private String fname;

	private String lname;

	private String phoneNumber;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserAccount(String username, String fname, String lname, String phoneNumber) {
		super();
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.phoneNumber = phoneNumber;
	}

	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserAccount [username=" + username + ", fname=" + fname + ", lname=" + lname + ", phoneNumber="
				+ phoneNumber + "]";
	}

}

