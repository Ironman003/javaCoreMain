package Group9Doubts;

public class StaticWithReturnSameClass {

	public int show(int a, int b) {
//		        a=20, b=30
//				c=a+b=50
						
		return a + b;

	}
	public String show(int x)
	{
		int y=30,z;  //local
		
		String name ="velocity";
		return name;
	}
	
	public int printInt(int x, int y)
	{
		int z=x+y;
		
		return z;
	}

	public static void main(String[] args) {
		int d=3;
		int x=50;  //local
		StaticWithReturnSameClass obj = new StaticWithReturnSameClass();
		   int store = obj.show(30, 55);
		   System.out.println(""+store);
		  String store1  = obj.show(x);
		  System.out.println(""+store1);
		  int store3 = obj.printInt(50,70);
		  if (d==3) {
			  System.out.println("store3="+store3);
		}
	}

}
