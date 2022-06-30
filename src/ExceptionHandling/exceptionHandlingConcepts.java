package ExceptionHandling;

public class exceptionHandlingConcepts {
	int a = 10, b = 0, c;
	char s='a';
	void show() {

		c = a / 2;
		System.out.println(c);
	}

	public static void main(String[] args) {
		exceptionHandlingConcepts obj = new exceptionHandlingConcepts();
		
		try {
			obj.c = obj.a / obj.b;
			System.out.println(obj.c);
		} catch (Exception e) {
			System.out.println("we are defaulting your input to 2");
			obj.show();
		}

	}
}
