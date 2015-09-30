package com.training;

public class PrintString {

	
	public synchronized static void printString(String str1, String str2 ) // printed in defined order otherwise printed randomly
	{
		System.out.println("Thread"+Thread.currentThread().getId()+" Entering");  // to get the thread id that's running 
		System.out.println(str1);
		
		try {
			Thread.sleep(500); // delay between str1 and str2
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println(str2);
		System.out.println("Thread"+Thread.currentThread().getId()+" Leaving");
	}
	

}
