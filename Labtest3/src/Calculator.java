
public class Calculator {
	
	public int  addition(int a,int...b)
	{
		int sum = 0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
		}
		return sum;
	}
	public int  substraction(int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public int multi (int b,int...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
	public double Division(double b,double...a)
	{
		int c = 0;
		for(int i=0;i<a.length;i++)
		{
			c+=a[i];
		}
		return c;

	}
}






	
	
		