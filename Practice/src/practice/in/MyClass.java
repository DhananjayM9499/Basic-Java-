package practice.in;
import java.util.Scanner;

class Square{
	
	public void Area() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of square");
    int length=scan.nextInt();
    int Areasq=length*length;
    System.out.println("Area of square is = "+Areasq+" square unit");
    
	}
}

class Cylinder{
	public void Area(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of the circle ");
		int radius=scan.nextInt();
		System.out.println("Enter the height of the circle ");
		int height=scan.nextInt();
		float Areacyl=3.14f*radius*radius*height;
		System.out.println("The area of the cylinder is = "+Areacyl+" square units");
		
	}
}

class Main{
	public static void main(String[] args) {
		Square square=new Square();
		square.Area();
		Cylinder cylinder=new Cylinder();
		cylinder.Area();
	}
}



