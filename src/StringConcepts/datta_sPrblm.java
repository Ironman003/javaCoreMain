package StringConcepts;

import java.util.Scanner;

public class datta_sPrblm {
public static void main(String[] args) {
	
	int a[]={1,2,4,5,6,7};
	System.out.println(""+ a.length);
	String s="akshau";
	Scanner obj = new Scanner(System.in);
	int size;
	System.out.println("enter the size of array");
	size=obj.nextInt();
	char c[]= new char[size];
	
	for (int i = 0; i <c.length; i++) {
		c[i]=obj.next().charAt(c[i]);
		
	}
	System.out.println("*****************");
	for (int j = 0; j < c.length; j++) {
		System.out.println(c[j]);	
	}	
}
}
