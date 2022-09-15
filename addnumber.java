
public class addnumber {

	static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		AddNumber(100);
		System.out.println(sum);
	}

	private static int AddNumber(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
		
	}

}