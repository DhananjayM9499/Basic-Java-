package cdac.in;
import java.util.*;
public class CharArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("number of entries ");
		int c=scan.nextInt();
		char[] array= new char[c];
	for (int i = 0; i < array.length; i++) {
		System.out.println("Enter char: "+ (i+1));
		array[i]=scan.next().charAt(0);
		
	
		
	}
	for (int j = 0; j < array.length; j++) {
		System.out.print(" "+array[j]);
	}
	

	}

}
