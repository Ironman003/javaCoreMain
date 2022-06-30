package Constructor;

public class Constructor {
	public String show()
	{
		String a="110";
//		System.out.println("method call from inside the constructor");
		return a;
	}
	Constructor(String a)
	{
		String s= show();
		System.out.println("" +a);
	}
	Constructor(int a)
	{
		System.out.println(a);
	}
public static void main(String[] args) {
	Constructor cons = new Constructor("445");
	Constructor cons1 = new Constructor(10);
	
	
}
}
