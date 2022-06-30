package StringConcepts;

public class stringClass {

	public static void main(String[] args) {
		// Strings are immutable in java?
		StringBuffer obj = new StringBuffer("I am");
		System.out.println(obj.hashCode());
		StringBuffer obj1 = new StringBuffer("Akshay");
		String obj2="a";   //a a 
		String obj3="ab";
//		System.out.println(obj2.concat(obj3));
//		System.out.println(obj2);
//		
		System.out.println(obj.append(obj1));
		System.out.println(obj);
		System.out.println(obj.hashCode());
		//		System.out.println(obj.hashCode());
//		System.out.println(obj1.hashCode());		
		String str="abc";  //same 98=abc   98=abcd
		String str1="abc"; // same
		StringBuffer obj12 = new StringBuffer("I am");  
		StringBuffer obj13 = new StringBuffer("I am");   //diff
		
		//length
		//String lenght();
		
	}
}
