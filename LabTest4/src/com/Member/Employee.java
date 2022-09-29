package com.Member;

public class Employee extends member {
	String specialization;
	
	void display()
	{
		System.out.println("Name of employee:"+name);
	 	System.out.println("Age of employee :"+age);
	 	System.out.println("Contact of employee:"+contact);
	 	System.out.println("Address of employee:"+address);
	}
	public void printSalary( double salary)
	{
		System.out.println("Salary:"+salary);
	}
	

}
