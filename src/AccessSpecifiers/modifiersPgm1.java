package AccessSpecifiers;

//import sun.jvm.hotspot.ui.action.ShowAction;

public class modifiersPgm1 {
	private int a = 10; // private scope lmt to class.
	int b = 20; // default scope within the pkg.
	protected int c = 30; // protected scope within this pkg.
							// we can access outside of the pkg with hlp of condition. eg.inheritance
	public int d = 40; // scope thought the project.
 
	private void ShowActio()
	{
		System.out.println("modifiersPgm1 yes");
	}
	static void modifiersPgm1() {
		modifiersPgm1 objDemo = new modifiersPgm1();
		int a = 10;
		System.out.println("hi");
		System.out.println("" + objDemo.b);

	}

	static void show1() {
		System.out.println(
				"hence its default method so we can access this method in outside of the class and with in the pkg ");
	}

	private void show2() {
		System.out.println("we can access this method nly in same class");
	}

	protected void show3() {
		System.out.println("we can access this method in same pkg as well as diff pkg by using inheritance");
	}

	public void show4() {
		System.out.println("we can access public method throught the project.");
	}
//	overload//compile time // name same para diff
	// run //overriding // same name para same

//	public static void main(String[] args) {
//		modifiersPgm1 obj = new modifiersPgm1();
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);
//		modifiersPgm1();
//		}

}
