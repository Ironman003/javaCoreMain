package BasicPrograming;

public class MethodCallFromDiff_Class1_1 {

	public static void show() {
		System.out.println("Static show display");
	}

	void show1() {
		System.out.println("Non Static show display");
	}

	public static void stars()
	{
		for(int i=0; i<6;i++)
		{
			for(int k=5; k>i;k--)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("  * ");
//				System.out.println("\\");
			}
		System.out.println("");
//		System.out.println("     /\\");
//		System.out.println();
	
		}
		System.out.print("");
//		stars1();
	}
	public static void stars1()
	{
		System.out.print("");
		for(int i=0; i<6;i++)
		{
			for(int k=5; k>i;k--)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("/\\");
//				System.out.println("\\");
			}
		System.out.println();
//		System.out.println("     /\\");
//		System.out.println();
		
		}
	}
	public static void main(String[] args) {
		System.out.println("hi");
	}
}
