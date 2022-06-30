
public class garbageCollectorPgm {
	  void show() {
		 System.out.println("ok this is show");
	}
	  protected void finalize()
	    {
	    	
//	    	obj.show();
	        System.out.println("Before Destory the Object perform some activity");
	        System.out.println("Release connection");
	        System.out.println("Close network connection");
	    }
	  public static void main(String[] args) 
	    {
		  garbageCollectorPgm obj = new garbageCollectorPgm();
		  garbageCollectorPgm obj2 = new garbageCollectorPgm();
		  //		  System.out.println(obj.hashCode());
	        obj = null;
	        System.gc(); 
	        //memory discard obj obj ref nahi 
	        System.out.println("hi");
	        System.out.println("Done" +obj.hashCode());
	        
	    }  
	  
}
