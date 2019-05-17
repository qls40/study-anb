package com.javalec.study6;

public class CallByValue {
	
	public static void primitiveTypeSwap(int param1,int param2) {
		int temp = param1;
		param1 = param2;
		param2 = temp;
	}
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		System.out.println("CallByValue");
		System.out.println("primitiveTypeSwap() 호출전 : x =" + x + ", y =" + y);
		primitiveTypeSwap(x,y);
		System.out.println("primitiveTypeSwap() 호출후 : x =" + x + ", y =" + y);
		System.out.println();

	}
}
