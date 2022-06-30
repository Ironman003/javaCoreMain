package Exception_Handling;

public class exceptionClass {
	public static void main(String[] args) {
System.getProperties();
		try {
			System.out.println("statement 1");
			int a = 10, b = 2, c;
			c = a / b; // arith
			int d = (Integer) null;// numm pointer exception

			System.out.println("statement 2 = " + c); // infinity
		} catch (ArithmeticException | NullPointerException obj) {
			System.out.println("statment 3" + obj);
		}  finally {
			System.out.println("statement 5");
		}
		System.out.println("statement 6");
	}
}
