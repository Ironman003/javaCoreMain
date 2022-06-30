package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class LinkList {
public static void main(String[] args) {
			
	LinkedList<Object> list = new LinkedList<Object>();

//	list.addFirst("is");
	list.add("a");
	list.addLast("Akshay");
	System.out.println(list.element());
	System.out.println(list.contains("Akshay"));
	System.out.println(list);
	list.addFirst("This");
	System.out.println(list);
	list.removeFirst();
	System.out.println(list);
	list.removeFirst();
	System.out.println(list);
	list.addFirst("is");
	list.add(0, "This");
	System.out.println(list);
	list.remove(3);
	list.add(1);
	list.add(2.3f);
	
	System.out.println(list);
	System.out.println(list.element()); 
	
//kmmk
}
}
