package cdac.in;
import java.util.*;
public class NestedElseIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.println("Enter first number");
		num1=scan.nextInt();
		
		System.out.println("Enter second number");
		num2=scan.nextInt();
		
		System.out.println("Enter third number");
		num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" is greater than "+num2+" and "+num3);
				
			}
				
		}
		else if(num2>num3) {
			System.out.println(num2+" is greater than "+num1+" and "+num3);
		}
		else {
			System.out.println(num3+" is greater than "+num1+"and"+num2);
		}
	}

}
