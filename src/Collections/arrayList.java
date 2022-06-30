package Collections;

import java.util.ArrayList;

public class arrayList {
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	ArrayList obj = new ArrayList();
	try {
		@SuppressWarnings("null")
		int a=(Integer) null;
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	for (int i = 0; i < 11; i++) {// cc * (3/2)+1 = 10 * 1.5+1
		obj.add(i);
		System.out.println(obj);
	}
	obj.add(4, 11);
	System.out.println(obj);
	System.out.println(obj.size());
}
}
