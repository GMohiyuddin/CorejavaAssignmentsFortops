package coreJava;

import java.util.Scanner;

public class Arethmetic_assign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			int result = num1 / num2;
			System.out.println("Result is " + result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Can't devided by zero enter positive value");
			e.printStackTrace();
		}
	}
}
