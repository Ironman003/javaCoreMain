package Group9Doubts;
 
public class WhileDEmo {
	 int i=1; //global
	 
	    static void show()
	 {
	    	WhileDEmo obj2 = new WhileDEmo();
	    	int num=2,j=1,x=1; //12 bytes
	    	boolean a=false;
			String s="SWITCH CASE";
//			System.out.println("lenght \t of string s is=" +s.length());
//			System.out.println(s.toLowerCase());
			
//			int z=1;
			
			if(a==true)
			{
				switch(x)
				{
				case 1:
					while(obj2.i<=10)
					{
						System.out.println(num*obj2.i); //2*1=2
						obj2.i++; //i=2	
					}
					break;
				case 2:
					while(j<=10)
					{
						System.out.println("v alue of j is = " +j);
						j++;
					}
					break;
				default:
					System.out.println("case not matched");
					
				}
			}
			else {
			System.out.println("if condition is false");
			}
	 }
	public static void main(String[] args) {
			show();

	}
	
}
