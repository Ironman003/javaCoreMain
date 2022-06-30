package superAndThis;

public class child extends parent {
	 int a = 303;

//	child() {
//		System.out.println("this is a child constructor");
//	}

	void a()
	{
		super.a();
		super.a("hi this is parameter constructor");
		System.out.println("hi this is a child method");
	}
	

}
