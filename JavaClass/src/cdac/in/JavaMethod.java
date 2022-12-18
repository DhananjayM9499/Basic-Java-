package cdac.in;
import java.util.*;
class DegreeToFahrenheit{
	
	public float Celcius(float Celciusvalues) {
		float Result=0.0f;
		Result= ((9 * Celciusvalues + (32 * 5 )) / 5);
		
		return Result;
		
	}
}

public class JavaMethod {


	public static void main(String[] args) {
		float Temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in Degree Celcius");
		Temp=scan.nextFloat();
		DegreeToFahrenheit degree=new DegreeToFahrenheit();
		float finalresult = degree.Celcius(Temp);
		System.out.println(finalresult);
	}

}
