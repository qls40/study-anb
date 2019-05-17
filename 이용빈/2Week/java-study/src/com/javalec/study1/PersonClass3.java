package com.javalec.study1;

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
	
	public PersonClass3(String userid, String userpw) {
		this.userId = userid;
		this.userPw = userPw;
	}
}
