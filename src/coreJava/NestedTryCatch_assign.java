package coreJava;

import java.util.Scanner;

public class NestedTryCatch_assign {
	public class NestedTryCatchExample {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        try {
	            int[] a = new int[5];
	            try {
	                a[5] = 30 / 0;
	            } catch (ArithmeticException e) {
	                System.out.println("Cannot divide by zero!");
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index out of bounds!");
	        }
	        
	        sc.close();
	    }
	}
}
