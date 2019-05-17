package com.javalec.study6;

public class CallByReference {
	int value;
	
	CallByReference(int value){
		this.value = value;
	}
	
	public static void referenceSwap(CallByReference x, CallByReference y) {
		int temp = x.value;
		x.value = y.value;
		y.value = temp;
	}
	
	public static void main(String[] args) {
		CallByReference x = new CallByReference(10);
		CallByReference y = new CallByReference(20);
		System.out.println("CallByReference");
		System.out.println("referenceSwap() 호출 전 : x = " + x.value + ", y = " + y.value);
		referenceSwap(x, y);
		System.out.println("referenceSwap() 호출 후 : x = " + x.value + ", y = " + y.value);
	}
}


