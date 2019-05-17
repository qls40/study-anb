package com.javalec.study2;

public class PersonClass3 {
	private String userId;
	private int userPw;
	
	public PersonClass3() {
		
	}

	public PersonClass3(String userid){
		this.userId = userid;
	}
	
	public PersonClass3(int userPw) {
		this.userPw = userPw;
	}
	
	public PersonClass3(String userid, int userpw) {
		this.userId = userid;
		this.userPw = userPw;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getUserPw() {
		return userPw;
	}

	public void setUserPw(int userPw) {
		this.userPw = userPw;
	}
}
