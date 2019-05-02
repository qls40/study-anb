package com.javalec.study.three;

import java.math.BigDecimal;

public class FloatingPointClass {
	
	public void method() {
		//double형 실수 더하기 
		double param1 = 2.5;
		double param2 = 0.2;
		System.out.println("double형 실수 더하기 : " +param1 + param2);
		
		//bigDecimal사용한 연산 매개변수로 문자열을 넣어준다.
		BigDecimal bigDecimalParam1 = new BigDecimal("2.5");
		BigDecimal bigDecimalParam2 = new BigDecimal("0.2");
		System.out.println("bigDecimal을 사용한 연산 : "+bigDecimalParam1.add(bigDecimalParam2));
		
	}
}
