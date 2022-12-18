package cdac.in;
import  java.util.*;
class Entry{
	public void Calculations() {
		double Amount,Principal,interest,years,time,decimal = 0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the principal amount");
		Principal=scan.nextDouble();
		
		System.out.println("Enter interest ");
		decimal=scan.nextDouble();
		
		System.out.println("Enter compound times ");
		time=scan.nextDouble();
		
		System.out.println("Enter the time period");
		years=scan.nextDouble();
		interest=decimal/100;
		Amount= (Principal*Math.pow(1+(interest/time),years));
	System.out.println(Amount);
	}
	
}


public class Compoundinterest {

	public static void main(String[] args) {
		Entry compoundinterest=new Entry();
		compoundinterest.Calculations();

	}

}
