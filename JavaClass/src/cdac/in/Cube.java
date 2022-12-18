package cdac.in;
import java.util.Scanner;
 public class Cube {

	public void Volume() {
		double length,vol;
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the cube");
		length=scan.nextDouble();
		vol=length*length*length;
		System.out.println("The volume of the cube is = "+vol+" cube units");
		
		

	}
	}
