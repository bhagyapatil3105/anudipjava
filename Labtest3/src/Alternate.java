
public class Alternate {

		static void addArrays(int ar1[][],int ar2[][]){
			int ar3[][]=new int[ar1.length][ar1[0].length];
			//int size=ar1.length;
		//	int add[]=new int[size];
			for (int i=0;i<ar1.length;i++)
			{
				for (int j=0;j<ar1[i].length;j++)
				{
					ar3[i][j]=ar1[i][j]+ar2[i][j];
			
				System.out.println(ar3[i][j]+" ");
			}
			System.out.println();
		}
		}

		public static void main(String[] args) {
			int ar1 [][]= {{3,4,5},{6,7,8}};
			int	ar2 [][]= {{1,2,3},{8,9,10}};
			addArrays(ar1,ar2);
		}
			
}


