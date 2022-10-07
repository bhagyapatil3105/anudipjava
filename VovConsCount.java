import java.util.Scanner;
public class VovConsCount {
	   
	    public static void main(String[] args) {    
	    	Scanner  scan=new Scanner(System.in);
	    	System.out.println("Enter string : ");
			
			String str=scan.nextLine();
			str.toLowerCase();
	              
	        int vovCount = 0, consCount = 0;    
	            
	        for(int i = 0; i < str.length(); i++) {    
	            
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                 
	                vovCount++;    
	            }    
	            
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {   
	            	  
	                consCount++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vovCount);    
	        System.out.println("Number of consonants: " + consCount);    
	    }    
	}   
	            

	