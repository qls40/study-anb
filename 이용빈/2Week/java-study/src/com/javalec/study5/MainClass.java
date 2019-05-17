package com.javalec.study5;

public class MainClass {

	public static void main(String[] args) {
		
		VarargsClass.varargsMethod1("leeyongbin","shunwoohoon","leejonghyun","anbTech");
		System.out.println();
		
		VarargsClass.varargsMethod2(100, 200, "var1", "var2", "var3" , "var4", "var5");
		System.out.println();
		
		
		toArray("nodejs","mongodb","express","nosql","angular");
		toArray("hahaha","nanana","papapa","foo");
		toArray("java","C#","spring","bootstrap","html","javascript","css");
	}
	
	//배열을 사용할때 메소드 전달 인자를 가변적으로 할수 있음
	public static String[] toArray(String...strings) {
		for(String string : strings) {
			System.out.print(string +" ");
		}
		System.out.println();
		System.out.println("배열의 총길이 : "+ (strings.length-1) );
		System.out.println();
		return strings;
	}
	
}
