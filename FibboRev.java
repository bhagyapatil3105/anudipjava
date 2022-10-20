package MultiThreading.com;

public class FibboRev {
	
		  synchronized public void fiboo()
		    {
				
		        int f1 = 0, f2 = 1;
		      //Declare and Initialize the number of terms
		        System.out.println("First 10 terms of fibonnaci series: ");
		        //Print the fibonacci series
		        for (int i = 1; i <= 10; ++i)
		        {
		            System.out.print(f1 + " ");
		            int sum = f1 + f2;
		            f1 = f2;
		            f2 = sum;
		        }
		    }
		        
		
			synchronized public void rev() {
				//reverse the number 
				System.out.println("\nrevers of ten number  ");
				for ( int num = 10; num >= 0; num--) { 
			    System.out.println(num);

}
			}
		        }
