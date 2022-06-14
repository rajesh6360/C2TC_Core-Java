package com.first.core;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
		int sum = 0, count =0;
		while (sc.hasNextInt())
		{
			int num = sc.nextInt();
			sum += num;
			count++;
		}
		int mean = sum / count;
		System.out.println("Mean: "+mean);

	}

}
}