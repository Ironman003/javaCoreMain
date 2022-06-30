package MultipleInheritanceInterface;

interface A{
	 void show();
}
interface B{
	 void show1();
}
public class InterfaceClass implements A,B {
	public  void show() {
		System.out.println("hi this method calls by using interface");
		
	}
	public  void show1() {
		System.out.println("hi this method calls by using interface");
		
	}
	 static public  void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
		obj.show();
		obj.show1();
		
		
		
	}


}
