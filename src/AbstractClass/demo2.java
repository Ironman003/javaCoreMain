package AbstractClass;

import java.util.Scanner;

public class demo2 {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String name[] = new String[3];
		System.out.println("Enter a Strings Upto 3 Elements");
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.nextLine();
		}
		System.out.println("****** Finally Got The Desired Output :) *****");
		for ( String f : name) {
			System.out.println(f);		
		}
		
}
}
