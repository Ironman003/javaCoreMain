package Group9Doubts;

public class StaticLocalInstancePractice2 {

	public static void main(String[] args) {
		
		int z=0;
	if (z==1) {
		StaticLocalInstancePractice.show();
	}
	else
	{
		StaticLocalInstancePractice obj = new StaticLocalInstancePractice();
		obj.hide();
		String StoreString = obj.returnTypeShowNonstatic(" Die");
		
		System.out.println("Result of returnTypeShowNonstatic = " +StoreString);
	}
	StaticLocalInstancePractice.Stringshow("Akshay","Kamble");
	
	 float storeFloat= StaticLocalInstancePractice.returnTypeShow(30.0f, 30.2f);
	 System.out.println("result of returnTypeShow is = " +storeFloat);
	  
	}
	

}
