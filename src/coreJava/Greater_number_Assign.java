package coreJava;

import java.util.Scanner;

public class Greater_number_Assign {
	public static void main(String[] args) {
		int i ,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number i :");
		i=sc.nextInt();
		System.out.println("enter the number j :");
		j=sc.nextInt();
		System.out.println("enter the number k :");
		k=sc.nextInt();
		if(i>j) {
			if(i>k) {
				System.out.println("i is greater than j");
			}
			System.out.println("i is greater than k");
		
		}else {
			System.out.println("i is less than j and k");
			
		}
	}
}
