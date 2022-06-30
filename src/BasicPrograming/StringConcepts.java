package BasicPrograming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringConcepts {
	public static void main(String[] args) {
		WebDriver obj = new ChromeDriver();
		String s = "Akshay Is Here";
		String a="hi";
		String aa="hi";
		String ss = new String("hi");
		String sss = new String("hi");
//		System.out.println(ss==sss);
//		System.out.println("Original String of 's' Is = " +s);
		a=a.concat(aa);
//		System.out.println(a);
		ss.equals(sss);
//		System.out.println(m);
		if(ss.equals(aa)) {
			System.out.println("ok");
			
			
		}
		else {
			System.out.println("not ok");
		}
//		Length(); method counts the string char including white spaces
//		System.out.println("\nLenght Of String Is = "+ s.length());  // \n used for new line
		
//		toUpperCase(); method Converts the string into upper case
//		System.out.println("\nUppercase Of String 's' Is = " + s.toUpperCase());
		
//		toLowerCase(); method Converts the string into lower case
//		System.out.println("\nLowercase Of String 's' IS = " +s.toLowerCase());
		
//		indexOf(); method requires an argument it use to get the index of specified element 
//		of the string.
//		note: String start with 0th position.
//		System.out.println("\nThe index of specified element within the string is = " +s.indexOf("Is"));
		
	}

}