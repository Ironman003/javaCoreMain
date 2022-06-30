package StringConcepts;

public class spiltStringClass {

	public static void main(String[] args) {
		// split()// seperate words by finding?
		// akshay is. here //No
		// akshay. is. here //yes
		// akshay.is.here //yes
		String sen = "akshay. is here* djfdjhfdf jvbjfbfd .f";
//     	String ref[] = sen.split("\\.");// no
//		String ref[] = sen.split(". ");//yes
//		System.out.println(ref.length);
		String ref[] = sen.split("\\*");// no
//		System.out.println("akshay \"is\" here");
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
	}
}
