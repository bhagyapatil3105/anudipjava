
public class HelloWorldp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month="May";
		int year=2020;
		switch(month)
		{
		case"jan","March","May","July","Aug","oct","Dec"->
		System.out.println("Number of days=31");
		case"April","Jun","Sep","Nov"->
		System.out.println("Number of days=30");
		case"Feb"->{
			if(year%4==0)
				System.out.println("Leap year and Number of days=29");
			else
				System.out.println("Number of days=28");
		}
		default->System.out.println("Invalid month");

		}
	}

}
