package Encapsulation;

import OopsConcept.oopsDemo1;

public class encapPgm1 {

	// data member & methods wrap in a single unit.
	// where as member are private,default and method is public
	private int a;
	int b;

	public void wrap(int e) {

		b = e; // we are accessing private.
//			System.out.println(a);

	}

	public int rreturn()

	{
		return b;
	}

	public void display() {
		System.out.println("value of default specifier 'b' is = " + b);
	}

	public void wrap1(int e) {

		a = e; // we are accessing private.
//		System.out.println(a);

	}

	public int rreturn1()

	{
		return a;
	}

	public void display1() {
		System.out.println("value of private specifier 'a' is = " + a);
	}

	public static void main(String[] args) {
		encapPgm1 obj = new encapPgm1();
		obj.wrap(10);
		
	}

}
