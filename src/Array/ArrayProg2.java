package Array;

import java.util.Scanner;

public class ArrayProg2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // we can give any number matrix
		int a, b;
//		c=100
		String c = "@";
		System.out.println("Enter matrix no.");
		a = sc.nextInt();
		b = sc.nextInt();

		int z[][] = new int[a][b];
		int add = z.length - (a - b);

		for (a = 0; a < z.length; a++) {
			for (b = 0; b < add; b++) {
//			 z[a][b]= c;   // z[a][b]=100
				System.out.print("@" + " " + c + "\t");
//				 c++; 
			}
			System.out.println("");

		}
	}
}