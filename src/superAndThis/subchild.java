package superAndThis;

public class subchild extends child{
//	subchild()
//	{
//		System.out.println("this is a subclass constr");
//	}
	
	// what does mean by overloading?
//	show()
//	show(int a)
//	show(int a, int b)
	//what does mean by over riding?
	
	
	void a()
	{
		super.a();
		System.out.println("hi this is a subchild method");
	}
public static void main(String[] args) {
	subchild obj =  new subchild();
	obj.a();
//	obj.disp();
	
}
}
