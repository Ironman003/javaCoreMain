package Group9Doubts;

public class ForLoop {
   static String s="Tables";
   String d="1";
	public static void main(String[] args) {
		ForLoop obj = new ForLoop();
		
		// if String s== Tables ( print the for loop) /if not print else
		int a=4;
//		String s="Tables";
		
 switch(obj.d)
 {
 case "1":
		if ( s == "Tables") {
			for(int i=1;i<=10;i++)
			{
			System.out.println(a +"*" +i +"=" +(a*i) );
			}	
		}
		else {
			System.out.println("condtion not true");
		}
		break;
		
		default:
			System.out.println("case not matched");
 }
	}

}
