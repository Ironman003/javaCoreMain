package Casting;

public class implementClass {
	void casting() {    									
		int a;
		int b;
		float c = 34.4f;
		char d = 's';
		a = d;
		System.out.println("stored char into int a implicitly = " + a);// implicit casting
		b = (int) c;
		System.out.println("Stored float value into int explicitly");
	}
	public static void main(int args) {
		System.out.println("hi this is again main");
	}
	public static void main(String args) {
//		implementClass impl = new implementClass();
//		impl.casting();
		
//		childClass cObj= new childClass(); //implicit casting
//		cObj.nonPrimitiveCast();
//		cObj.example();
//		parentClass pObj = new childClass();
//		pObj.nonPrimitiveCast();
//		((childClass) pObj).example(); // explicit casting
//		main(2);
//		grandFatherClass obj = new childClass();
//		((parentClass) obj).nonPrimitiveCast();
		System.out.println("jbfeef");
//		grandFatherClass obj23 = new childClass();
//		((childClass) obj23).example();
//		parentClass obj1= (childClass) new grandFatherClass();// down casting not allowed run time error
		
	}
}
