package Interface;

import java.util.Scanner;

public class interfaceClass implements interface1, Interface2, Interface3 {
	long phn_no;
	protected static float height;
	String name;
	int age;
	static int catch1;

	@Override
	public void show1(float height1) {
		height = height1;
		System.out.println("Enter Phone Number");
		Scanner scan = new Scanner(System.in);
		phn_no = scan.nextLong();
		System.out.println("Enter Height");
		height = scan.nextFloat();
//		System.out.println("height is = " +height);
	}

	@Override
	public void show() {
//		System.out.println("this is interface 2");
		System.out.println("Enter Name ");
		Scanner scan1 = new Scanner(System.in);
		name = scan1.next();
		System.out.println("Enter Age");
		age = scan1.nextInt();
	}

	void show3() {
		System.out.println("");
		System.out.println("Name is = " + name);
		System.out.println("Age is = " + age);
		System.out.println("Phone number is = " + phn_no);
		System.out.println("Height is = " + height);
		System.out.println("Birth year is = " + catch1);
		

	}

	public int show4() {
		Scanner scan2 = new Scanner(System.in);
		int birthYear = scan2.nextInt();
		return birthYear;

	}

//	public static void main(String[] args) {
//		interfaceClass obj = new interfaceClass();
//		obj.show();
//		obj.show1(height);
//		System.out.println("enter birth year");
//		catch1 = obj.show4();
//		obj.show3();	
//	}

}
