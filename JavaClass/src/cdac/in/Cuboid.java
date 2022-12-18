package cdac.in;
import java.util.*;                                                                                           
  public class Cuboid{                                                                            
	  public void Volume() {                                                                      
		  Scanner scan = new Scanner(System.in);                                                   
		  System.out.println("Enter the length of the cuboid");                                   
		  int length=scan.nextInt();                                                               
		                                                                                           
		  System.out.println("Enter the height of the cuboid");                                    
		  int height=scan.nextInt();                                                              ;
		                                                                                           
		  System.out.println("Enter the width of the cuboid");                                     
		  int width=scan.nextInt();                                                               
		                                                                                          
		  int Vol=length*height*width;                                                            
		  System.out.println("The volume of the cuboid is "+Vol+" cube units");
	  }
	 
 }