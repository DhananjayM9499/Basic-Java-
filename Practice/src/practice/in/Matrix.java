package practice.in;
import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int[][] Matrices;
	Matrices = new int[3][3];
	for (int row = 0; row < Matrices.length; row++) {
		for (int column = 0; column < Matrices.length; column++) {
			System.out.println(" Enter "+(column+1)+" number of "+(row+1
					)+" row ");
			 Matrices[row][column]= scan.nextInt();
			
		}
		
	}
for (int i = 0; i < Matrices.length; i++) {
	for (int j = 0; j < Matrices.length; j++) {
		System.out.print(Matrices[i][j]+" ");
	}
	System.out.println(" ");
	
}
	}

}
