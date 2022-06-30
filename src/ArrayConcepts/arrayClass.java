package ArrayConcepts;

import java.util.Scanner;

public class arrayClass {
public static void main(String[] args) {
	int a[] = new int[11]; //  |0 |1 |2 |3 |4 |5 |6 |7 |8 |9|
	a[0]=10;
	a[1]=11;
	a[2]=10;
	a[3]=11;
	a[4]=12;
	a[5]=12;
	a[6]=12;
	a[7]=12;
	a[8]=12;
	a[9]=(int) 12.34f;
//	a[10]=12;
     
	String c[] = new String[12];
	c[0]="akshay";
	System.out.println(c[0].hashCode());
	c[1]="kundan";
	c[2]="naresh";
	c[3]="kamble";
	c[4]=" ";
	c[0]=c[0].concat(c[4]);
	System.out.println(c[0].hashCode());
	System.out.println(c[0].length());
	
	System.out.println(c[0].concat(c[4]));
	
	System.out.print(c[0].concat(c[3]));
//	System.out.println(a[9]);
	int a1[]= {1,2,3,4,5,6,7,8,9,10}; //declaration & initili
//		System.out.println(a1.length);
	 //array lmtd
//Scanner obj =  new Scanner(System.in);
//System.out.println("enter something");
//String name= obj.nextLine();
//System.out.println(name);

}
}
