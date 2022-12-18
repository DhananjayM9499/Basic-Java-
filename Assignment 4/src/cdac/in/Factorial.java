package cdac.in;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num, Factorial=1;
	System.out.println("Enter the number for factorial");
	num=scan.nextInt();
	if (num==0||num==1) {
		System.out.println("Your factorial is : 1");
	}
	else {
	for (int i = num; i >= 1; i--) {
		Factorial=Factorial*i;
		
	}
System.out.println("Your factorial is : "+Factorial);
	}
	}

}
