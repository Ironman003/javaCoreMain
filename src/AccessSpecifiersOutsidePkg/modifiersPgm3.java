package AccessSpecifiersOutsidePkg;

import AccessSpecifiers.modifiersPgm1;

public class modifiersPgm3 extends modifiersPgm1 {
 void show()
 {
	 modifiersPgm3 obj = new modifiersPgm3();
	 System.out.println("we are accessing protected variable from diff pkg = " +obj.c);
	 System.out.println("we are accessing public variable from diff pkg = " +obj.d );
 }
 public static void main(String[] args) {
	 modifiersPgm3 obj1= new modifiersPgm3();
	 obj1.show();
	 System.out.println("");
	 obj1.show3();
	 System.out.println("");
	 obj1.show4();
}
}
