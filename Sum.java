package com.string;

public class Sum {
	public int sum(int[] values, int start,int end) throws ArrayIndexOutOfBoundsException,IllegalArgumentException,NullPointerException
	{
		int sum=0,i=0,j=0;
		
		for(i=start;i<=end;i++) 
			
		{
		if(values.length==0) 
		{
			throw new IllegalArgumentException("\n You passed an array of length 0 : ");
		}
		
	//else if(values=="null") 
	{
		throw new NullPointerException("\n Cannot read the array length because values is null  : "+sum);
//}
		}
		
			
	}
		return sum;
	}
}
	