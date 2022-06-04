
public class company {
     String name;
	        public static void main(String[] args) {
		        company c1 = new company();
		        c1.name = " C2TC ";
		        company c2 = c1;
		        c1 = null;
		        System.out.println(c2.name);
		        new company();
		        company c3 = null;
		        c3.name = " C2TC ";
		        System.out.println(c3.name);}}
 