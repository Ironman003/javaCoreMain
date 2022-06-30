package BasicPrograming;

public class NestedIf {
public static void main(String[] args) {
	String id = "akshay@123";
	String pass = "12345678";
	
	if(id == "akshay@123") 
	{
		if(pass == "12345678")
		{
			System.out.println("Sucessfully login");
		}
		else 
		{
			System.out.println("Wrong Pass");
		}
		
	}
	else
	{
		System.out.println("Wrong ID");
	}
}
}
