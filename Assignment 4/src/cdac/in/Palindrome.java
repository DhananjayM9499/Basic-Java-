package cdac.in;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		int a, reverse=0, originalNumber;
		System.out.println("Enter the number to check for palindrome");
	    a=scan.nextInt();
	    originalNumber=a;
	    
	    while (a!=0) {
			reverse =reverse*10+a%10;
			a=a/10;
		}
	    if (originalNumber==reverse) {
	    	System.out.println("The number is a palindrome");
			
		}
	    else {
	    	System.out.println("The number is not a palindrome");
	    }
	    

	}

}
