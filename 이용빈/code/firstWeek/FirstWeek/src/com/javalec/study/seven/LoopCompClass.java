package com.javalec.study.seven;

import java.util.Calendar;

public class LoopCompClass {
	
	public static void main(String[] args) {
	
    int[] array = new int[10000000];
    int arraySize = array.length;
    for (int i = 0; i < arraySize; i++)
    {
        array[i] = i;
    }
    
    long forStartTime = System.currentTimeMillis();
    for (int i = 0; i < arraySize; i++)
    {
		 System.out.println(array[i]); 
    }
    long forEndTime = System.currentTimeMillis();
    
    
    long forEachStartTime = System.currentTimeMillis();
    for (int i : array) {
		 System.out.println(i); 
	}
    long forEachEndTime = System.currentTimeMillis();
    
    System.out.println("for vs forEach 대량배열처리 속도비교  배열크기 : "+array.length);
    System.out.println("*****for문*****");
    System.out.println("For문 - 총 소요시간(초.0f) : " + (forEndTime - forStartTime)/1000.0f + "초");
    System.out.println();
    
    System.out.println("****forEach문****");
    System.out.println("ForEach문 - 총 소요시간(초.0f) : " + (forEachEndTime - forEachStartTime)/1000.0f + "초");    

	}
	
	 public String formatTime(long time) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        return c.get(Calendar.MILLISECOND) + "초";
    } 
	 
	 
}
