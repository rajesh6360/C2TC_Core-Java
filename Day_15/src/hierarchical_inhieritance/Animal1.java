package hierarchical_inhieritance;



public class Animal1 {
	void eat()
	{
		System.out.println("eating");
	}
class Dog extends Animal1{
	void bark()
	{
		System.out.println("barking");
	}
}

class SingleInheritance{
	

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal1 a1 = new Animal1();
		Animal1 a = new Dog();
		Dog d1 = new Animal1();
		d.bark();
	    d.eat();
	    }
}
}
