package array;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40};
		int a = 50;
		call(a,arr);
		System.out.println(a);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		}
		public static void call(int a, int arr[])

		{
		a = a + 2;
		arr[0] = 100;
		arr[1] = 200;
	}

}
