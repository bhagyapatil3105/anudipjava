package com.Member;

public class MainMember {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		emp.name="bhagyashree";
		emp.age=21;
		emp.contact="9867554434";
		emp.address="Kalyan";
		emp.specialization="xxx";
		emp.display();
		emp.printSalary(45000);
		 
		Manager m=new Manager();
		m.name="sayli";
		m.age=22;
		m.contact="1234567435";
		m.address="Vashi";
		m.dept="Sales";
		m.display(); 
		m.printSalary(30000);

	}

}
