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

		int t[][];
		int [][]k;
		int []u[];
		
		int g[][]=new int[3][4];
		//00 01 02 03 
		//10 11 12 13 
		//20 21 22 23 
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("Enter num");
				g[i][j] = scr.nextInt();
			}
		}
		

		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(g[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
}
