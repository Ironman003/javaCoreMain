package ArrayConcepts;

public class twoDArray {
	public static void main(String[] args) {
		// 0 1
		// 0 | 1 | | 2 | ||
		// 1 | 3 | | 4 | ||

		int ref[][] = new int[2][3];
		ref[0][0] = 1;
		ref[0][1] = 2;
		ref[1][0] = 3;
		ref[1][1] = 4;
		ref[0][2] = 5;
		ref[1][2] = 6;
//	System.out.println(ref.length);
		int add = ref.length + 1;
		for (int i = 0; i < ref.length; i++) {
			for (int j = 0; j < add; j++) {
				System.out.print(ref[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}
}
