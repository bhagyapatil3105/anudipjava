package com.Member;

public class Manager extends member {
	String dept;
	
	void display()
	{
		System.out.println("Name of manager:"+name);
	 	System.out.println("Age of manager :"+age);
	 	System.out.println("Contact of manager:"+contact);
	 	System.out.println("Address of manager:"+address);
	
	}
	public void printSalary( double salary)
	{
		System.out.println("Salary:"+salary);
	}
}
