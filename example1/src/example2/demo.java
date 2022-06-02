package example2;

public class demo {
	int x;
}
class Testdemo{

	public static void main(String[] args) {
		demo myobj1 = new demo();
		demo myobj2 = new demo();
		myobj1.x = 24;
		myobj2.x = 55;
		System.out.println(myobj1.x);
		System.out.println(myobj2.x);
	}
}
