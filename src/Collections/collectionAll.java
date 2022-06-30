package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class collectionAll {
	public static void main(String[] args) {
//		ArrayList arryObj = new ArrayList<>();
		// searching easy time 0(1)
		// ins pre
		/*
		 * 1) add 2) add by index 3) remove 4) remove by index 5) hashcode 6) clear 7)
		 * size
		 * 
		 */

//		arryObj.add(1);
//		arryObj.add(3);
//
//		arryObj.add(4);
//		arryObj.add(2);
//	Collections.sort(arryObj);

		Vector vecObj = new Vector<>();
		// synchronised
		// searching easy com 0(1)
		// ins pre
		/*
		 * 1) add 2) add by index 3) remove 4) remove by index 5) capacity 6) size
		 */

		LinkedList linkObj = new LinkedList<>();
		// manupulation easy and ins diff so com = 0(n)
		// ins pre
		/*
		 * 1) add 2) add by index 3) remove 4) remove by index 5) size 6) clear 7)
		 * hashcode
		 */

		HashSet hsetObj = new HashSet<>();

		// synch
		// ins not pre
		/*
		 * 1)add 2) remove 3) size 4) clear 5)hashcode
		 */
		LinkedHashSet linksetObj = new LinkedHashSet<>();
		// ins pre
		/**
		 * 1) add 2) remove 3)size 4) clear 5) hashcode
		 */
		TreeSet tObj = new TreeSet<>();
		// ins asse

		/**
		 * 1) add 2) remove 3)size 4) clear 5) hashcode
		 */
		 ArrayList<Integer> students = new ArrayList<Integer>(); 
		 
	        //Adding elements to the ArrayList
	        students.add(1);
	        students.add(8);
	        students.add(4);
	        students.add(7);
	        students.add(6);
	 
	        Collections.sort(students);
	        	
	       System.out.println(students);
	}
}
