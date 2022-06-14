package static_method;

public class Student {
int rollno;
String name;
static String college ="ITS";
Student(int r, String n){
	rollno = r;
	name =n;
}
static void change() {
	college = "Acharya";
}
void display () {
	System.out.println(rollno+" "+name+" "+college);
}
public static void main(String[] args) {
	Student s1 = new Student(111,"Pavan");
	Student s2 = new Student(222,"Mahesh");
	change();
	s1.display();
	s2.display();

}
}