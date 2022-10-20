package MultiThreading.com;

public class Reverse extends Thread {
	private FibboRev rv;
	public Reverse(FibboRev rv) {
		super();
		this.rv = rv;
	}

	
	public Reverse() {
		// TODO Auto-generated constructor stub
	}



	//run methoed
	public void run() {
		rv.rev();
	}
}
