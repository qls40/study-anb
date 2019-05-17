package com.javalec.study7;

public class SwapClass {
	private String name;
	
	public SwapClass(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override 
	public String toString() {
		return "Name : " + name;
	}
	
	public static void SwapName(SwapClass sw) {
		sw.setName("leeyongbin");
	}
	
	public static void main(String[] args) {
		SwapClass swapC = new SwapClass("yongbin");
		System.out.println("변경전 " + swapC);
		SwapName(swapC);
		System.out.println("변경후 " + swapC);
	}
}
