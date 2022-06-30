package mainMethodOverloading;

public class mainoverloading {
	
	public static void show()
	{
		System.out.println("Im calling from main method with argument as a string");
	}
	public void show1()
	{
		System.out.println("Im calling from main method without argument as a string");
	}
public static void main(char[] args) {
	mainoverloading obj = new mainoverloading();
	show();
	
//	show();
}

		int show(int s)
		{
			return s;
			
		}
public static void main(String[] argsdfdfnffdfk) {
	mainoverloading obj = new mainoverloading();
//	obj.show1();
	obj.show1();
	 int a = obj.show(11);
	 System.out.println(a);
}
}
