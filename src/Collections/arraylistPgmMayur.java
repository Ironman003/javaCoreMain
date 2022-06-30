package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class arraylistPgmMayur {
	static int count;

	public static void main(String[] args) {

		ArrayList<String> pList = new ArrayList<String>();
		pList.add("akshay");
		pList.add("akshay");
		pList.add("a");
		pList.add("c");
		pList.add("b");
		pList.add("b");
		HashSet<String> hset = new HashSet<String>(pList);
		System.out.println(hset);
		

	}
}
