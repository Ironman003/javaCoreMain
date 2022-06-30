package Group9Doubts;

public class ConstructorDemo {
	static int a,b;
	
	ConstructorDemo()
	{
		a=10;
	}
	ConstructorDemo(int c)
	{
		b=c;
	}
	ConstructorDemo(int a, int b)
	{
		a=a;
		b=b;
	}
	public void show()
	{
		System.out.println("A = " +a);
		System.out.println("B = "+b);
	}
public static void main(String[] args) {
	ConstructorDemo obj1 = new ConstructorDemo();
	obj1.show();
	System.out.println("with no para-----------");
	ConstructorDemo obj2 = new ConstructorDemo(20);
	obj2.show();
	System.out.println("with one para-----------");
	ConstructorDemo obj3 = new ConstructorDemo(20,30);
	obj3.show();
	System.out.println("with two para-----------");
}

}
