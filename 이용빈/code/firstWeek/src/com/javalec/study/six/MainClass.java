package com.javalec.study.six;

public class MainClass {

	public static void main(String[] args) {
		
		//PersonClass의 객체 person1, person2, person3 생성
		PersonClass person1 = new PersonClass("이용빈",30);
		PersonClass person2 = new PersonClass("홍길동",35);
		PersonClass person3 = new PersonClass("유해진",23);
		
		//getter 메서드 사용
		System.out.println("getter메서드 사용 : 클래스 변수값 접근");
		System.out.println("person1 이름 : "+person1.getName()+", 나이 : "+person1.getAge());
		System.out.println("person2 이름 : "+person2.getName()+", 나이 : "+person2.getAge());
		System.out.println("person3 이름 : "+person3.getName()+", 나이 : "+person3.getAge());
		System.out.println();
		
		//setter 메서드 사용
		person1.setName("이용빈2");
		person1.setAge(99);
		person2.setName("고길동");
		System.out.println("setter메서드 사용 : 클래스 변수값 변경");
		System.out.println("person1 이름 : "+person1.getName()+", 나이 : "+person1.getAge());
		System.out.println("person2 이름 : "+person2.getName()+", 나이 : "+person2.getAge());
		System.out.println("person3 이름 : "+person3.getName()+", 나이 : "+person3.getAge());
		
	}

}
