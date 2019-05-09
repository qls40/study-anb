package com.javalec.study.seven;

import java.util.ArrayList;

import com.javalec.study.six.PersonClass;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("while문");
		int i = 0;
		int result = 0;
		while(i < 10) {
			i++;
			result += i;
			System.out.println("while문 " + i +"번째 값 : "+result);
		}
		System.out.println();
		
		System.out.println("do..while문");
		i = 0;
		result = 0;
		do {
			i++;
			result += i;
			System.out.println("do..while문 "+ i +"번째  값 :"+result);
			}while( i < 10 );
		System.out.println();
	
		PersonClass person1 = new PersonClass("이용빈",30);
		PersonClass person2 = new PersonClass("홍길동",27);
		PersonClass person3 = new PersonClass("유해진",32);
		ArrayList<PersonClass> personArrayList = new ArrayList<PersonClass>();
		personArrayList.add(person1);
		personArrayList.add(person2);
		personArrayList.add(person3);
		
		System.out.println("for문");
		for(i = 0; i<=personArrayList.size()-1; i++) {
			for(int j=0; j<1; j++) {
				PersonClass person = new PersonClass();
				person = personArrayList.get(i);
				System.out.println("PersonName : "+person.getName()+" , PersonAge : "+person.getAge() );
			}
		}			
		System.out.println();
		
		System.out.println("forEach문");
		for(PersonClass person : personArrayList){
			System.out.println("PersonName : "+person.getName()+" , PersonAge : "+person.getAge() );

		}
		System.out.println();
	}
}
