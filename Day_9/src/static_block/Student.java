package static_block;

public class Student {
int rollno;
String name;
static String college;
static 
{
	college ="ITIs";
}
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
	Student s1 = new Student(111,"Rakesh");
	Student s2 = new Student(222,"Sandeep");
	change();
	s1.display();
	s2.display();
}
}
