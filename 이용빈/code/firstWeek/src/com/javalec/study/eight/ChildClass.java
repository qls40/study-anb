package com.javalec.study.eight;

public class ChildClass extends ParentClass {
	
	@Override
	public void Method() {
		System.out.println("ChildClass에서 Override하여 작성된 Method 입니다.");
	}
	
	@Override
	public final void FinalMethod() {
		System.out.println("ChildClass에서 Override하여 작성된 Method입니다.");
	}
	
}

