class Student {
	int id;
	String name;
	void insertRecord(int i,String n) {
		id=i;
		name=n;
	}
}
class  main {
	
	public static void main(String[]  args)  {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.insertRecord(111, "karan");
		s2.insertRecord(222, "aryan");
		System.out.println(s1.id +" "+ s1.name);
		System.out.println(s2.id +" "+ s2.name);
	}
		
} 


