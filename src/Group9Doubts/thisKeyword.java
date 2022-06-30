package Group9Doubts;

public class thisKeyword {
//	this keyword belongs to instance/global member of class........
	 int  a=10;
    void show()
	{
	 int a=12;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
		thisKeyword obj = new thisKeyword();
		obj.show();
	}
}



