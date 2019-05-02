package com.javalec.study.six;

public class HeapMemoryTest {
	public static int[] m1(int a) {
		int[] arr = m2(a + 1);
		arr[2] = a;
		return arr;
	}
	
	public static int[] m2(int a) {
		int[] arr = m3(a + 1);
		arr[1] = a;
		return arr;
	} 
	
	public static int[] m3(int a) {
		int []arr = new int[3];
		arr[0] = a;
		return arr;
	}
	
}
