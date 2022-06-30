package BasicPrograming;

public class ConditionalStatements {
	static void shoe()
	{
		System.out.println("ih");
	}
public static void main(String[] args) {
	ConditionalStatements obj = new ConditionalStatements();
	obj.shoe();
	int a;
	a=0;
	
	if (a==0) {
		System.out.println("Conditional statement meets the condition hence if  block is running and the number is zero ");
	}
	else if (a<0) {
		System.out.println("Conditional statement meets the  condition hence if_else block is running and the number is negative ");
	}
	else{
		System.out.println("Conditional statement  doesnt meets the  condition hence else block is running and th number is positive");
	}
	System.out.println("outside block with no cindition it means it always excute");
}

}
