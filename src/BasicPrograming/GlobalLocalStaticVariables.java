package BasicPrograming;

public class GlobalLocalStaticVariables {
	
	int a=10;  //Global or Instance variable b'cz its outside the method.
	
	static int b =20; //Static variable b'cz static variable starts with static keyword.
	
	public static void main(String[] args) {
		
		int c=30; //local variable b'cz its under the method.
		GlobalLocalStaticVariables obj = new GlobalLocalStaticVariables(); //Created object.

//We can directly print the local variable in output stream.	
		System.out.println("Local variable " + c);

//We can print Static variable with the class name b'cz Static is a part of class.	
		System.out.println("Static variable " + GlobalLocalStaticVariables.b);

//We can print the global/Instance variable with the help of object.	
		System.out.println("Global variable" +obj.a);
		
		
	}

}
