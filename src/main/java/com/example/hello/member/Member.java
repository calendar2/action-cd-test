package com.example.hello.member;

public class Member {
	private Long ID;
	private String USERNAME;
	private int AGE;

	public Member() {
	}

	public Member(String USERNAME, int AGE) {
		this.USERNAME = USERNAME;
		this.AGE = AGE;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int AGE) {
		this.AGE = AGE;
	}
}
