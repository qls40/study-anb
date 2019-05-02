package com.javalec.study.seven;

import java.util.Calendar;

public class LoopCompClass {
	
	public static void main(String[] args) {
	System.out.println("for문 forEach문 배열처리 소요시간 비교");
    int[] array = new int[10000000];
    for (int i = 0; i < array.length; i++)
    {
        array[i] = i;
    }
    
    System.out.println("*****for문*****");
    long forStartTime = System.currentTimeMillis();
    for (int i = 0; i < array.length; i++)
    {
		 System.out.println(array[i]); 
    }
    long forEndTime = System.currentTimeMillis();
    
    System.out.println("****forEach문****");
    long forEachStartTime = System.currentTimeMillis();
    for (int i : array) {
		 System.out.println(i); 
	}
    long forEachEndTime = System.currentTimeMillis();
    System.out.println("==========연산 결과==========");
    System.out.println("for문 시작시간 : " + new LoopCompClass().formatTime(forStartTime));
    System.out.println("for문 종료시간 : " + new LoopCompClass().formatTime(forEndTime));
    System.out.println("For문 - 총 소요시간(초.0f) : " + (forEndTime - forStartTime)/1000.0f + "초");
    System.out.println();
    
    System.out.println("forEach문 시작시간 : " + new LoopCompClass().formatTime(forEachStartTime));
    System.out.println("forEach문 종료시간 : " + new LoopCompClass().formatTime(forEachEndTime));
    System.out.println("ForEach문 - 총 소요시간(초.0f) : " + (forEachEndTime - forEachStartTime)/1000.0f + "초");    

	}
	//시간포멧 Func
	 public String formatTime(long time) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        return c.get(Calendar.MILLISECOND) + "초";
    } 
	 
	 
}
