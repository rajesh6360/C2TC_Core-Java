package hierarchical_inhieritance;

public class A {
	void message()
	{
		System.out.println("Class A");
	}
	class B
	{
		void message()
		{
			System.out.println("Class B");
		}
	}
class C extends A,B{
	public static void main(String[] args) {
		C obj = new C();
		obj.msg();
		
	}
	}


