package AccessSpecifiers;

public class subClassOfSamePkg extends modifiersPgm1 {
	void show() {
		subClassOfSamePkg obj = new subClassOfSamePkg();
		System.out.println("default variable accesing through the sub class = " +obj.b);
		System.out.println("protected variable accesing through the sub class = " +obj.c);
		System.out.println("public variable accesing through the sub class = " +obj.d);
	}
private void ShowActio()
{
	
	System.out.println("subClassOfSamePkg hi");
}
	public static void main(String[] args) {
		subClassOfSamePkg obj1 = new subClassOfSamePkg();
		obj1.show();
		System.out.println("");
		show1();
		System.out.println("");
		obj1.show3();
		System.out.println("");
		obj1.show4();
//		obj1.display();
		obj1.ShowActio();
		modifiersPgm1 obj2 = new subClassOfSamePkg();
	}
	
}
