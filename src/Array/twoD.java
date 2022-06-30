package Array;

import java.util.Scanner;

public class twoD {

	public static void main(String[] args) {
		int demo[]= {1,2,3,4};
		int a[][] = { { 1, 11, 111 }, { 2, 22, 222 }, { 3, 33, 333 }, { 4, 44, 444 } };
//		System.out.print(a[0][0]);
//		System.out.println(" " + a[0][1]);
//		System.out.print(a[1][0]);
//		System.out.println(" " + a[1][1]);
//		System.out.print(a[2][0]);
//		System.out.println(" " + a[2][1]);
//		System.out.print(a[3][0]);
//		System.out.println(" " + a[3][1]);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size Of Column.");
		System.out.print("\t");
		int sizeI = scan.nextInt();
		System.out.println("Enter The Size Of Row.");
		System.out.print("\t");
		int sizeJ = scan.nextInt();
		int b[][] = new int[sizeI][sizeJ];
		System.out.println("Enter Array Elements.");
		for (int i = 0; i < sizeI; i++) {
			for (int j = 0; j < sizeJ; j++) {
				System.out.print("\t");
				b[i][j] = scan.nextInt();
			}
		}
		System.out.println("---------Two Dimetional Matrix--------");
		for (int i = 0; i < sizeI; i++) {
			for (int j = 0; j < sizeJ; j++) {

				System.out.print("\t" + b[i][j]);
			}
			System.out.println("");
		}
	}
}
