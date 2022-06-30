package Array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayConcepts {
	public static void main(String[] args) {
		
	//primitive //non primitive =========Array new/ class new
	
//		datatye ref_variabe [] = new data_type[size];
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the size");
		int size=obj.nextInt();
//		System.out.println(size);
		
		String s[] = new String[size]; //size=3
		
//		s[0]="a";
//		s[1]="a";
//		s[2]="a";
		System.out.println("enter the strings");
		for (int i = 0; i < s.length; i++) {
			s[i]=obj.next();
//			System.out.println(s[i]);
		}
		System.out.println("***************output of strings are*************");
		for (int i = 0; i < s.length; i++) {
//			s[i]=obj.next();
			System.out.println(s[i]);
		}
		Arrays.sort(s);
		System.out.println("***************output of Sorted array is*************");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
}
