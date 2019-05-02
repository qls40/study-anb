package com.javalec.study.four;

public class OperatorCalcClass {
	
	public void method() {
		
		//4. 증감연산자의 동작
		int i = 1;      
		int j = ++i;    
		System.out.println("전위증감연산자 i : "+i+", j : "+j); // 결과  i : 2, j : 2

		i = 1;          
		j = i++;       
		System.out.println("후위증감연산자 i : "+i+", j : "+j); // 결과  i : 2, j : 1

		i = 1;
		j = --i;
		System.out.println("전위감소 연산자 i : "+i+", j : "+j); // 결과  i : 0, j : 0

		i = 1;
		j = i--;
		System.out.println("후위감소연산자 i : "+i+", j : "+j); // 결과  i : 0, j : 1
		System.out.println();
		
		int num = 10;
		System.out.println("++num : "+ ++num);			  // 결과 : 11
		System.out.println("num++ : "+ num++);			  // 결과 : 11
		System.out.println("num   : "+ num ); 			  // 결과 : 12 
		System.out.println("--num : "+ --num);			  // 결과 : 11
		System.out.println("num-- : "+ num--);			  // 결과 : 11
		System.out.println("num   : "+   num);			  // 결과 : 10
		
	}
	
}
