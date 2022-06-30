package AccessSpecifiers;

public class modifiersPgm2 {

	void show()
	{
		modifiersPgm1 obj = new modifiersPgm1();
		System.out.println("All variables are non static so we are accessing through object.");
		System.out.println("default specifier = "+obj.b);
		System.out.println("public specifier = "+obj.d);
		System.out.println("protected specifier = "+obj.c);
	}
//	public static void main(String[] args) {
//		modifiersPgm2 obj = new modifiersPgm2();
//		obj.show();
//
//	}

}
