package BasicPrograming;

public class PatternPgms {
	public void showStarAssending(int num1) {

		for (int i = 0; i < num1; i++) {
			for (int j =3; j > i; j--) {
				System.out.print(" ");
			} // *
			for (int j = 0; j <= i; j++) {
				// **
				System.out.print("^");
				System.out.print(" ");// ***
			
			}

			System.out.println("");

		}
		showLine1();
//		System.out.print("");

	}
	static void showLine() {
//		System.out.println("\t \t \t \t "+"  \"~--~~-~~-~~-~~-\"");
//		System.out.println("\f \r \b \\ \" \' ");
//		System.out.println("\"");
		int i=0;
		for (int j =3; j > i; j--) {
			System.out.println("   ^");
//			System.out.print(" ");
		}
	
	}
	static void showLine1() {
//		System.out.println("\t \t \t \t "+"  \"~--~~-~~-~~-~~-\"");
//		System.out.println("\f \r \b \\ \" \' ");
//		System.out.println("\"");
		int i=0;
		for (int j =1; j > i; j--) {
			System.out.println("   ^");
//			System.out.print(" ");
		}
	
	}
	static void showStarDecending() {
       showLine();
		int num = 0;
		for (int i = 3; i >= num; i--) {
			for (int j =3; j > i; j--) {
				System.out.print(" ");
//				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("^");
				System.out.print(" ");
			}
			System.out.println();
		}
//		System.out.print("");

	}

	public static void main(String[] args) {
		int num1 = 4;
		PatternPgms obj = new PatternPgms();
		System.out.println("\n \n");
		obj.showStarAssending(num1);
//		showLine();
		showStarDecending();
	
    
	}
}
