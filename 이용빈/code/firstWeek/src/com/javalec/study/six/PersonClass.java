package com.javalec.study.six;

public class PersonClass {
	
	//클래스의 속성 정의 
	private String name;
	private int age;

	//매개변수가 없는 Default생성자
	public PersonClass() {
		
	}
	
	//매개변수가 있는 생성자 정의
	public PersonClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
			this.age = age;
	}	
	
}
