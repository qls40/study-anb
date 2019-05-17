package com.javalec.study5;

public class VarargsClass {
	
	//가변인자는 같은 타입의 인자를 가변적으로 받을수 있다.
	public static void varargsMethod1(String ...strs) {
		for(String str : strs){
			System.out.println("이름 : " + str);
		}
	}
	
	//가변인자는 항상 메서드의 파라미터 마지막에 선언되야 한다.
	public static void varargsMethod2(int num1, int num2, String ...strs) {
		System.out.println("result : " + (num1+num2));
		for(String str : strs) {
			System.out.println("이름 : " + str);
		}
	}
	
}
