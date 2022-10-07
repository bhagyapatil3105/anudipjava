
import java.util.Scanner; 
	public class Palindrome {
	
	   public static void main(String args[])  
	   {  
	      String s1, s2= " " ;  
	      Scanner scan = new Scanner(System.in);   
	      System.out.println("Enter a string is a palindrome");  
	      s1 = scan.nextLine();   
	      int length = s1.length(); 
	      for (int i = 0; i < s1.length(); i++) 
	      
	         s2 = s2 + s2.charAt(i);  
	      if (s1.equals(s2))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string is not a palindrome.");   
	   

		}

	}

	