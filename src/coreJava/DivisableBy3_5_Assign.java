package coreJava;

import java.util.Scanner;

public class DivisableBy3_5_Assign {
	public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of i : ");
        for (int i = 0; i <= 100; i++) {
        	i=sc.nextInt();
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
      }
    
	}
}
