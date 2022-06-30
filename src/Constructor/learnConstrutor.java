package Constructor;

public class learnConstrutor {
	int a,b;
	learnConstrutor()
	{
		a=10;
	}
	learnConstrutor(int c)
	{
		b=c;
		
	}
	learnConstrutor(int d, int e)
	{
		a=d;
		b=e;
		
		
		
	}
	public static void show()
	{
		learnConstrutor obj = new learnConstrutor();
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
	}
public static void main(String[] args) {
//	learnConstrutor obj = new learnConstrutor();
//	obj.show();
	show();
	System.out.println("--------------");
//	learnConstrutor obj1 = new learnConstrutor(20);
//	obj1.show();
	show();
	System.out.println("--------------");
//	learnConstrutor obj2 = new learnConstrutor(20,30);
//	obj2.show();
	show();
}
}
