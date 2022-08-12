package exception_handling

public class Main {

public static void main(String[] args){

System.out.println("First line");

System.out.println("Second line");

int[] myIntArray = new int[]{1, 2, 3};

print(myIntArray);

System.out.println("Third line");

}

public static void print(int[] arr) {

System.out.println(arr[3]);

System.out.println("Fourth element successfully displayed!");

} 
	}


