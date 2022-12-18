package cdac.in;
import java.util.Scanner;

class Rectangle {

	
	public void Area(){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle");
		int length=scanner.nextInt();
		
		System.out.println("Enter the width of the rectangle");
		int width=scanner.nextInt();
		
		int rec=length*width;
		
		System.out.println("the area of the rectangle is = " + rec+" square units"+"\n");
		
	}
}

class Circle{
	
	
	public void Area() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		float radius=scanner.nextFloat();
		
		float cir=3.14f*radius*radius;
		
		System.out.println("the area of the rectangle is = "+cir+" square units");
	}
}


 class MainClass {

	public static void main(String[] args) {
	Rectangle rectangle=new Rectangle();
	rectangle.Area();
	
	Circle circle=new Circle();
	circle.Area();

	}

}
