
/*public class Matrix {
void multiply() 
{

	int p [][]= {{10,20,30},{1,2,3}};  
	int q[][]={{1,2,3},{40,50,60}}; 
		
		
		int r[][]=new int[p.length][p[0].length];
		 for (int i=0;i<p.length;i++)
		 {
			 for(int j=0;j<p[i].length;j++)
			 {
				 p[i][j]=p[i][j]*q[i][j];
				 System.out.print(r[i][j]+" ");
			 }
			 System.out.println() ;
		 }

	}
public static void main(String[] args) {

Matrix m=new Matrix();
m.multiply();
}
}*/
public class Matrix
{

	void Multiply()
 {
	//two matrix
 	int p[][]={{10,20,30},{1,2,3}};  
	int q[][]={{1,2,3},{40,50,60}};  
	//3rd matrix to store result
		int r[][]=new int[p.length][p[0].length];  
		  

		   for(int i=0;i<p.length;i++)
		{  
		  for(int j=0;j<p[i].length;j++)
		   {  
		     r[i][j]=p[i][j] * q[i][j]; 
		     System.out.print(r[i][j]+" ");  
		   }  
		    System.out.println(); 
		}
 }
	public static void main(String[] args) 
	{
		Matrix ma=new Matrix();
			ma.Multiply();

	}

}
