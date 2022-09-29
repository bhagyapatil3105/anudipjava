package com.bank;

public class Mainbank {

	public static void main(String[] args) {
		
		BA a=new BA();
	
		System.out.println("The Balance in BankA "+a.getBalance());
				
		BB b=new BB();
		System.out.println("The Balance in BankB"+b.getBalance());
				
		
		BC c=new BC();
		System.out.println("The Balance in BankC"+c.getBalance());
		

	}

}

