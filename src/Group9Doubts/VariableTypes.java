package Group9Doubts;

public class VariableTypes {

	int a=10;                //Global variable
	static int b = 20;       //Static variable
	
	void globalShow()        //Non static method
	{
		int c = 30;          //Local variable
		a++;
		b++;
		c++;
		
		System.out.println("[Value of Global variable 'a' is = " +a +"]" + "\n[Value of Static"
		+ " 'b' is = "  +b +"]"
	    +"\n[Value of Local 'c' is = " +c +"]");
	}
	
	static void staticShow() //Static method
	{
		VariableTypes obj2 = new VariableTypes();
		int d=50;
		obj2.a++;            //Here we created a object b'cz a belongs to global variable type.
		b++;
		d++;
	}
	

	public static void main(String[] args) {
		System.out.println("[We can directly print static varible value here B'cz both variable 'b' and 'main' method is static"
	    + "\nSo the value of b is = " +b +"]\n");
		VariableTypes obj = new VariableTypes();  //Object
		obj.globalShow();                         //Non static method call
//		obj.globalShow();
		staticShow();                             //Static method call
//		staticShow();
		
	}
}
