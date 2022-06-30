
public class B extends A {
	  private void display() {
	      System.out.println("B.display");
	   }
	    public void callDisplay() {
	      System.out.println("B.callDisplay");
	      display();
	   }  
}
