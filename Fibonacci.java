package MultiThreading.com;

public class Fibonacci extends Thread {
	private FibboRev fs;
	public Fibonacci(FibboRev fs) {
		super();
		this.fs = fs;
	}
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	/*public void fibonacci() {
		// TODO Auto-generated constructor stub
	}*/
	 //run methoed 

	public void run() {
		  fs.fiboo();
	 }
	
}

	
	
	
	
	
	

	 