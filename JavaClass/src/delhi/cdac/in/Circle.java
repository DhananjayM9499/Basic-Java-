package delhi.cdac.in;
import java.util.*;
public class Circle {
	public void Area() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int radius=scan.nextInt();
		float area=3.14f*radius*radius;
		System.out.println("The area of the circle is = "+area+"square units");
	}

}
