package com.training;

public class NotifyExample {
	
	
	public void display(){
		
		System.out.println("hello world");
	}
	
	@Override
	public String toString() {
		return "NotifyExample [balance=" + balance + "]";
	}
	
	
	private double balance=2000;

	public NotifyExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized double deposit(double amt){
		
		balance= balance+amt;
		System.out.println("Amount deposited"+amt);

		notify();
		
		return balance;
		
	}
	public synchronized double withdraw(double amt){
		
		while(balance<amt)
		{
			System.out.println("Insufficient balance- will wait for Transfer");
			System.out.println("current balance"+balance);

			try {
				wait();
				System.out.println("current balance"+balance);
				continue;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		balance= balance-amt;
		System.out.println("Got the money");
		System.out.println("balance left"+balance);

		return balance;
		}

}
