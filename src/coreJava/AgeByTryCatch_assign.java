package coreJava;

import java.util.Scanner;

public class AgeByTryCatch_assign {
	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter your age: ");
	      int age = input.nextInt();

	      try {
	         validate(age);
	         System.out.println("Welcome to vote!");
	      } catch (ArithmeticException e) {
	         System.out.println("Exception: " + e.getMessage());
	      }
	   }

	   public static void validate(int age) throws ArithmeticException {
	      if (age < 18) {
	         throw new ArithmeticException("not valid");
	      }
	   }
}
