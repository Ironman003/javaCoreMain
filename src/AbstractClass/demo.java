package AbstractClass;

import java.util.Scanner;

public class demo {
	static String show(String f) {	
		return f;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name[] = new String[3];
		System.out.println("Enter a String");
		String catch_outPut;
		for (String f : name) {
			f = sc.next();
			show(f);		
			catch_outPut= show(f);
			
		}
		System.out.println("**********Output Of String Elements*****");
		for (int i = 0; i <name.length; i++) {	
			System.out.println(name);
		}
}
}
