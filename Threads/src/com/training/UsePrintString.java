package com.training;

public class UsePrintString implements Runnable {
	
	
	private String str1;
	private String str2;
	
	
//super const
	public UsePrintString() {
		super();
	}


//para const
	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		Thread t = new Thread(this); // passing the this
		t.start();
	}



	@Override
	public void run() {


		PrintString.printString(str1, str2);
		
		
	}

}
