package inheritancedemo;

public class classmani {
	classmani()
	{
		this(80);
		System.out.println("s");
	}
	classmani(int a)
	{
		System.out.println("hi");
	}
public static void main(String[] args) {
	classmani obj = new classmani();
}
}