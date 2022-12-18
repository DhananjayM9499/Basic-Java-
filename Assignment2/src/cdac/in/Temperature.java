package cdac.in;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float temp;
		System.out.println("Enter temperature to convert C-F");
		temp=scan.nextFloat();
		float f = (9*temp + (32*5))/5;
		System.out.println("Your temperature in  Fahrenheit is =  "+f);
		
		

	}

}
