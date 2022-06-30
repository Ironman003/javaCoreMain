package BasicPrograming;

public class Swap2Values {
 public static void main(String[] args) {
	System.out.println(" \n\nThis is 2nd program for swapping a's and b's values by using 3rd temp variable");
	
	int a=10, b=20; //variable declaration
	System.out.println("\n\nprviouse values of a and b is " +"\n a=" + a +"\n b="  +b );
	int temp=a; 
	a=b;
	b=temp;
	System.out.println("\n\nUpdated swapped  values of a's and b's is " +"\na=" +a +"\nb=" +b );
}
}
