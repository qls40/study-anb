package com.javalec.study.five;

public class LogicalOperationClass {
	
	public void method() {
		
		System.out.println("논리합 False | True ");
		if (False() | True()) {
            System.out.println("false | true");
        }
		System.out.println();
		
        System.out.println("논리합 True | False");
        if (True() | False()) {
            System.out.println("true | false ----- short-circuit 적용안됨, False Func() 호출 됨");
        }
        System.out.println();

        
        System.out.println("조건부 논리합 False || True");
        if (False() || True()) {
            System.out.println("false || true");
        }
        System.out.println();

        System.out.println("조건부 논리합 True || False");
        if (True() || False()) {
            System.out.println("true || false ----- short-circuit 적용됨, False Func() 호출 안됨");
        }
        System.out.println();

        
        System.out.println("논리곱 True & False");
        if(True() & False()) {
        	System.out.println("true & False");
        }
        System.out.println();
        
        System.out.println("논리곱 False & True");
        if(False() & True()) {
        	System.out.println("False & True");
        }
        System.out.println("False & True ----- short-circuit 적용안됨. True Func() 호출됨\n");

        
        System.out.println("조건부 논리곱 True && False");
        if(True() && False()) {
        	System.out.println("True & False");
        }
        System.out.println();        

        System.out.println("조건부 논리곱 False && True");
        if(False() && True()) {
        	System.out.println("False & True");
        }
        System.out.println("False && True ----- short-circuit 적용됨. True func() 호출 안됨\n");
        
	}
	
	public static boolean True() {
		System.out.println("True 호출");
		return true;
	}
	
	public static boolean False() {
		System.out.println("False 호출");
		return false;
	}
	
}
