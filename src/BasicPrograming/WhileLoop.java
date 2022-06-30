package BasicPrograming;

public class WhileLoop {
public static void main(String[] args) {
//	int x=5;
	//1 8 27
	
//	int i=1;
//	while(i<=5)
//	{
//		System.out.println(i*i*i);
//		i++;
//	}
//	while(x<=50)
//	{
//		System.out.print("[" +x +"]" + " ");
//		x=x+5;
//	}
//	int num=5,num2=1;
//	
//	while(num2<=10)
//	{
//		System.out.println(num*num2);
//		num2++;
//	}
	
	for (int i=1; i <= 5; i++) {
        // inner loop for column
        for(int j=1; j <= i; j++) {
           // print star
           System.out.print("* ");
        }
        // new line
        System.out.println();
     }
}
}
