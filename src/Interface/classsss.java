package Interface;

public class classsss implements demo1,demo2 {

	@Override
	public void show() {
		System.out.println("hi");
	}
	public void show1() {
		System.out.println("bye");
	}
public static void main(String[] args) {
	demo1 obj  = new classsss();
//	obj.show11();
}

//public void show11() {
//}
}
