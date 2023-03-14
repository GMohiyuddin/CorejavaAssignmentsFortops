package coreJava;

import java.util.Scanner;

public class Numsumaverage_assign {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number " + i + ": ");
			int num = sc.nextInt();
			sum += num;
	        }
	        int avg =  sum / 5;
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + avg);
	    }
}
