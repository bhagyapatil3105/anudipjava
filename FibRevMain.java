package MultiThreading.com;

public class FibRevMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	          try
	          {
	               Fibonacci fib = new Fibonacci();
	               fib.start();
	              
	               Reverse rev = new Reverse();
	               rev.start();
	          }
	          catch (Exception ex)
	          {
	               ex.printStackTrace();
	          }

	}

}
}
