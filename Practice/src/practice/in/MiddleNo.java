package practice.in;
import java.util.*;
public class MiddleNo {
static Scanner scan=new Scanner("");
	public static void main(String[] args) {
		int[] array= {100,101,102,103,104,105,106,107,108,109,110,111};
		int a= 11;
		int i=0;
		while(array[i]!=array[a]) {
		i++;
		a--;
		}
		System.out.println(array[i]);	
	}

}
