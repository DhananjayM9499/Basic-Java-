package practice.in;

public class MDArraySum {

	public static void main(String[] args) {
		int sum = 0;
		int[][] Add = { { 4, 5, 6 }, { 7, 4, 1 }, { 8, 5, 2 } };
		for (int row = 0; row < Add.length; row++) {
			for (int column = 0; column < Add.length; column++) {
				sum = sum + Add[row][column];
			}

		}
		System.out.println(sum);
	}

}
