package labtestjunit;
import java.security.InvalidParameterException;
import java.util.ArrayList;
//import java.util.ArrayList;

public class AddMul {
	public int add(int m, int n) {
		return m + n;
	}

	public int multiply(int m, int n) {
		return m * n;

	}
	public Boolean ispalindrome(int number) {
		int Temp, Reminder, Reverse = 0;
	
		Temp = number;
		while(Temp > 0) {
			Reminder = Temp %10;
			Reverse = Reverse * 10 + Reminder;
			Temp = Temp /10;
		}
		
		if(number == Reverse) {
			return true;
		}
	
		else
		{
			
		return false;
		}
	}
			
			public int isArrayList()
			{
		        ArrayList<Integer> arrli= new ArrayList<Integer>();
		        arrli.add(8);
		        arrli.add(5);
		        arrli.add(6);
		        arrli.add(4);
		        arrli.add(9);
		        return  arrli.size();
		           
		 
			}
		
}