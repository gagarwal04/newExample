package com.training;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	System.out.println("main started"); // main thread

		
		Thread t= new Thread(){

			@Override
			public void run() {
			
				System.out.println("Reading");            
				
				try {
					System.in.read();   // reading from keyboard
				} catch (Exception e) {
					// TODO: handle exception
					
					e.printStackTrace();  
				}
				
				System.out.println("Finished Reading");
			}
			
		};
		
		
		t.start();   
		
		System.out.println("is it alive " + t.isAlive());
		
	 // if not used main had executed first then started new thread and execeuted-- done sequentially 
	try {
		t.join();                 //new thread joined the main thread -- execute  simultaneously
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
 System.out.println("is it alive " + t.isAlive());
	//t.start();
	System.out.println("main finished");

	}

	}
