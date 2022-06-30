package Group9Doubts;

public class StaticLocalInstancePractice {
	static int a = 12;
	int add;

	public String returnTypeShowNonstatic(String b) { 
		String a = "Do or", storeString;
		storeString = a + b;
		return storeString;

	}

	public static float returnTypeShow(float a, float b) {
		float addfloat;
		addfloat = a + b;
		return addfloat;

	}

	public static void para_Show(int a, int xyz) {
		StaticLocalInstancePractice obj2 = new StaticLocalInstancePractice();
		int b = 12;
		obj2.add = a + xyz;
		System.out.println("obj2.add = a + xyz" + "\nResult = " + obj2.add
				+ "\nHere 'add' is instance variable 'a' & 'xyz' is a parameters of type int.");
	}

	public static void Stringshow(String fname, String lname) {
		String store;
		store = fname + lname;
		System.out.println("store = fname + lname" + "\nResult is = " + store
				+ "\nHere 'store' is local String type variable , 'fname' & 'lname' are parameters of string type");
	}

	public static void show() {
		StaticLocalInstancePractice obj1 = new StaticLocalInstancePractice();

		int b = 20;
		obj1.add = a + b;

		System.out.println("obj1.add = a + b" + "\nResult is = " + obj1.add
				+ "\nHere 'add' is instance variable 'b' is local variable and 'a' is a static variable.");
	}

	public void hide() {

		int b = 30;
		add = a + b;
		System.out.println("add = a + b" + "\nResult is = " + add
				+ "\nHere 'a' is a static variable,'b' is local variable & 'add' is a Instance variable");

	}

	public static void main(String[] args) {
		int xyz;
		StaticLocalInstancePractice obj = new StaticLocalInstancePractice();
		switch (0) {
		case 1:
			System.out.println("[This is a static  method without parameter:]\n[method name :show()]\n");
			show();
			break;
		case 2:
			System.out.println(
					"[This is a static  method with int type parameters:]\n[method name:para_Show(int, int)]\n");
			para_Show(20, 30);
			break;
		case 3:
			System.out.println("[This is a Instance method without parameter:]\n[method name:hide()]\n");
			obj.hide();
			break;
		case 4:
			System.out.println(
					"[This is a static  method with String type parameters:]\n[methode name:Stringshow(String,String)]\n");
			Stringshow("Iron", "man");
			break;
		case 5:
			System.out.println(
					"[This is a static  method with return type of float and it takes float parameters :]\n[methode name:returnTypeShow(float,float)]\n");
			float d = returnTypeShow(20.3f, 20.00f);
			System.out.println("addfloat = a + b" + "\nResult is = " + d
					+ "\nHere 'addfloat' is local variable, 'a' & 'b' are float type prameters ");
			break;
		case 6:
			System.out.println(
					"[This is a Instance  method with return type of String and it takes string parameter:]\n[mrthod name:returnTypeShowNonstatic(String)]\n");
			String storeString = obj.returnTypeShowNonstatic(" Die");
			System.out.println("storeString = a + b" + "\nResult is = " + storeString
					+ "\nHere 'storeString' & 'a' is local variable of type string & 'b' is  parameter of type string.");
			break;
		default:
			System.out.println("\n\n\tPlease update in the \"switch case\" and see the detailed output :)");

		}

	}

}
