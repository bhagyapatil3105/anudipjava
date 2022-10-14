package com.string;

public class Mainsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		int[] values= {1,2,3,4,5};
		try 
		{
			System.out.println(s.sum(values,1,3));
		} 
		catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | NullPointerException e) 
		{
			System.out.println(e);
		}
	}
	
	

	}


