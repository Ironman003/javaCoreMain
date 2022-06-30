package multilevelInheritance;

import inheritancedemo.a;

public class Child extends Parent {
	
	
public static void disply()
{
	System.out.println("this belongs to child");
}

public static void main(String[] args) {
	Child obj = new Child();
	disply();
	print();
	obj.show();
}
}
