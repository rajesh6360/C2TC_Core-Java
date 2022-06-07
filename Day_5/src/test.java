
public class test {

	public static void main(String[] args) {
		test obj = new test();
		obj.start();
	}
void start() {
	String stra = "do";
	String strb = method(stra);
	System.out.println(":" + stra + strb);
}
String method(String stra) {
	stra = stra + "good";
	System.out.println(stra);
	return "good";
	
	}

}  
