package com.string;

public class Mainmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				InvalidmailidExcepti e=new InvalidmailidExcepti("bhagya", "bhagya");
				e.setName("bhagya");
				
			try
			{
				e.setEmail("bhagya12@gmail.com");
			}
			catch(InvalidMailIdException ie)
			{
				System.out.println(ie);
			}
			System.out.println("Name is :"+e.getName());
			System.out.println("Email is :"+e.getEmail());
			}

		

	}


