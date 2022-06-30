package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HashSetExample {
	
	
	public static void main(String[] args) {
//		 String a;
//		System.out.println(a);
		ArrayList<String> obj1 = new ArrayList<>();
		obj1.add("math");
		obj1.add("math");
		obj1.add("hindi");
//		HashMap<String, ArrayList<String>> obj = new HashMap<>();
		Hashtable<String, ArrayList<String>> obj = new Hashtable<>();
		obj.put("books", obj1);
		
		System.out.println(obj);

//	

//	book = ma,hind,englo
//	System.out.println(obj);
//	HashSet<Object> obj = new HashSet<>();
//for (int i = 0; i < 100; i++) {
//	obj.add(i);
//	System.out.println(obj);
//	
//}

//System.out.println("hash set are based on time complexity not on any other values like ascii  \n"+obj);
//obj.clear();
//System.out.println(obj);

		HashSet<Object> objInt = new HashSet<>();
		objInt.add("a"); // 097
		objInt.add("!"); // 033
		objInt.add("1"); // 049
		objInt.add("A"); // 065
		objInt.add(1);
		objInt.add("Akshy");

//objInt.iterator();
//for (Object integer : objInt) {
//	
//}

//for (int i = 0; i < 2; i++) {
//	objInt.add("as");
//	System.out.println(objInt);
//}

//objInt.remove("a");
//System.out.println(objInt);

		System.out.println(objInt.size());
		objInt.toArray();
//System.out.println(objInt.toArray());

		for (Object object : objInt.toArray()) {

			System.out.println(object);
		}
	}
}
