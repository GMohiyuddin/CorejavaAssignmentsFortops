package coreJava;

import java.util.Scanner;

public class userinput_sum_assign {
	public static void main(String[] args) {
        try (Scanner sc1 = new Scanner(System.in)) {
			System.out.print("Input number: ");
			int n = sc1.nextInt();
			int n1 = n;
			int n2 = n * 11;
			int n3 = n * 111;
			int sum = n1 + n2 + n3;
			System.out.println(n1+ " + " +n2+ " + " +n3+ " = " +sum);
		}
         
  }
}
