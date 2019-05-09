package com.javalec.study.etc;


public class Student {
	String name;
	Student(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student _obj = (Student)obj;
		return name == _obj.name;
	}
}

