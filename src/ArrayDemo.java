import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[];
		int b[] = new int[5];
		a = new int[5];

		int[] c = new int[5];// 1D array
		// 0 1 2 3 4

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter number");
			c[i] = scr.nextInt();// 0 1 2 3 4
		}

		System.out.println("Content of the Array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(c[i]);// 0 1 2 3 4
		}

		// print sum of 1D array
		// 10 20 30 40 50
		// sum => 150
		// min => 10
		// max => 50
	}
}
