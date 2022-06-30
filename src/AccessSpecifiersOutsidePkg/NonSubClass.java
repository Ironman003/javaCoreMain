package AccessSpecifiersOutsidePkg;

import AccessSpecifiers.modifiersPgm1;

public class NonSubClass {
	
	void show()
	{  
		modifiersPgm1 obj1 =  new modifiersPgm1();
		System.out.println("we are accessing the public variable from outside of the pkg = " +obj1.d);
	}
public static void main(String[] args) {
	NonSubClass obj = new NonSubClass();
	obj.show();
}
}
