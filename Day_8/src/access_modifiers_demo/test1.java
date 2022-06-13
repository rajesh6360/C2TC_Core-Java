package access_modifiers_demo;

public class test1 {
	protected int i=10;
	protected void show() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		test1 t1 = new test1();
		t1.show();
		System.out.println(t1.i);

	}

}
