package com.javalec.study.etc;

public class ObjectComp {

	public static void main(String[] args) {
		//객체 비교
		Student s1 = new Student("hong");
		Student s2 = new Student("hong");
		System.out.println(s1 == s2);       //객체 주소값을 비교
		System.out.println(s1.equals(s2));	//object.equals 오버라이드
		
		
	}

}
