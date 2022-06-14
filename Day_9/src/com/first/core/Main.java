package com.first.core;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		    try(Scanner sc = new Scanner(System.in)){
			String name = sc.nextLine();
			char gender = sc.next().charAt(0);
			int age = sc.nextInt();
			long mobileNo = sc.nextLong();
			double cgpa = sc.nextDouble();
			System.out.println("Name: "+name);
			System.out.println("Gender: "+gender);
			System.out.println("Age: "+age);
			System.out.println("Mobile Number: "+mobileNo);
			System.out.println("CGPA: "+cgpa);
		}
	}
}

