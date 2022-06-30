package Gen;

import java.util.Scanner;

public class implement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  football or cricket");
		String match = scan.next();
		String s = "Akshay";
		System.out.println(s.length());
		football obj = new football();
		cricket obj1 = new cricket();
		String catchF = obj.play("football");
		String catchC = obj1.play("cricket");
		if (match.equals(catchF)) {

			System.out.println(catchF);
		} else if (match.equals(catchC)) {

			System.out.println(catchC);
		} else {
			System.out.println("String not matched");
		}

	}
}
