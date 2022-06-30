package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class hasMapDemo {

	public static void main(String[] args) {
		HashMap obj = new HashMap();
		obj.put(1, 1);
		obj.put(2, 2);
		obj.put(2, 3);
		
		System.out.println(obj);
		
//		LINKEDLIST //HASTABLE   LEAGCY // HASHMAP NAVIN 
//		
//		SCHOOL = STUDENT =>  ROLL INT 
//							NAME STRING 
//							HEIGHT FLOAT	
		
		ArrayList student = new ArrayList<>(); //hetro
		student.add("Akshay");
		student.add(12);
		student.add(5.6f);
		student.add("black");
		
		ArrayList student1 = new ArrayList<>(); //hetro
		student1.add("kundan");
		student1.add(13);
		student1.add(5.7f);
		student1.add("white");
		
		HashMap<String, ArrayList> obj22 = new HashMap<>();
//		HashMap<String, ArrayList> obj23 = new HashMap<>();
		
		obj22.put("d.y patil", student);
		System.out.println(obj22);
		
		obj22.put("d.m school", student1);
		System.out.println(obj22);
		
		//searching //automation time  // 7hrs dvs error 2+7=9 // 4+2=6 //3  reduced 
		
	}
}
