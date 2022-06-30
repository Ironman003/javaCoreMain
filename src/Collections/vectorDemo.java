package Collections;

import java.util.HashMap;
import java.util.Vector;

public class vectorDemo { 
	public static void main(String[] args) {
		Vector<Integer> obj = new Vector<Integer>();
		obj.add(1);
		obj.add(2);
//		HashMap<1,obj> obj1 = new HashMap<>();
	
		try {
			 @SuppressWarnings("null")
			int a=(Integer) null;
			 obj.add(a);
		}
		catch(Exception e) {	
		}
		for (int i = 0; i <9; i++) { //capacity nature doubly
			obj.add(i+i);
			System.out.println(obj);
	
		}
		System.out.println("Capacity of vector object is = "+obj.capacity());
		System.out.println("Size of vector object is = "+obj.size());	
	}
}
