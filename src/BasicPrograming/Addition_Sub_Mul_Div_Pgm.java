package BasicPrograming;
;
public class Addition_Sub_Mul_Div_Pgm {
int dv=10;

static int a;

public static void show()
{
	a++;
	System.out.println(""+a);
	int x=060,y=050;
	System.out.println("octal number Addition = "+ (x+y));
   int a=10; //local
   System.out.println(""+a);

	
}

	public static void main(String[] args) {
		Addition_Sub_Mul_Div_Pgm.show();
		byte num1, num2, addition,mul, div; //declaration
		num1 = 10;//Initialization
		num2 = 11;//Initialization
		addition =  (byte) (num1 + num2); //Usage
		System.out.println("num1 initial value" +num1);
		System.out.println("num2 initial value" +num2);
		System.out.println("\nAddition of num1 and num2 is =" +addition);
		mul = (byte) (num1 * num2);
		System.out.println("\nMultiplication of num1 and num2 is =" +mul);
		div = (byte) (num1 / num2);
		System.out.println("\nDivision of num1 and num2 is ="  +div);
		byte sub;
		sub= (byte) (num1 - num2);
		System.out.println("\nSubtraction of num1 and num2 is =" +sub);
		String s="dsd";
		String d="787878tfg \n ";
		System.out.println(s + d +"\n");
	
	
	}
	public static void main(int args) {
		System.out.println("\n");
		System.out.println("gpo");
	}
}
