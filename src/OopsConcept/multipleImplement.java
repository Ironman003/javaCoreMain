package OopsConcept;

public class multipleImplement implements multiple1,multiple2 {

	
		int a;
		@Override
	public int show1(int b) {
		int a=2;
		this.a+=b; // a= a+b
		return this.a;
		
	}

	@Override
	public void show() {
		System.out.println("interface multiple2");
		
	}
	 multipleImplement(){
		 System.out.println("multipleImplement's construtor");
	}
	 multipleImplement(int a){
		 this();
		 System.out.println(a);
	}
	 multipleImplement(int a , int abc){
		 this(12);
		 a += abc; 
		 System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		multipleImplement obj2 = new multipleImplement();
		multipleImplement obj = new multipleImplement(123,123);
//		obj.show();
//		obj.show1();
//		int show;
//	show=obj.show1(12);
//	System.out.println(show);
	}

}
