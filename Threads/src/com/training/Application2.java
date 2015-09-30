package com.training;

//Notify application
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final NotifyExample bk1 = new NotifyExample();
		
		Thread t1= new Thread(){
			
			public void run(){
				
				bk1.withdraw(5000);
			}
		};
		
		t1.start();
		Thread t2= new Thread(){
			
			public void run(){
				
				bk1.deposit(2000);
				
			}
		};
		
		t2.start();
		
	}

}
