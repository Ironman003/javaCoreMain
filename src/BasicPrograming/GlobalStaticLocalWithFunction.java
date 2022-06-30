package BasicPrograming;

public class GlobalStaticLocalWithFunction {
//	int b=20;
	 int c=30;
	 
	 void show(int a) {
		
//		int a=40;
		a++; //41
		++c; //31
		System.out.println("a = " +a +"\n"+"c = " +c);
	}
	public static void main(String[] args) {
	GlobalStaticLocalWithFunction obj = new GlobalStaticLocalWithFunction();
		int a=20;
			obj.show(4);
			obj.show(40);
			
	
	}

}
