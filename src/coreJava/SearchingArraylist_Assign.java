package coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchingArraylist_Assign {
	 public static void main(String[] args) {
	        
		 	ArrayList<Integer> numbers = new ArrayList<Integer>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to search: ");
	        int numToSearch = sc.nextInt();

	        int index = numbers.indexOf(numToSearch);
	        if (index == -1) {
	            System.out.println(numToSearch + " not found in the array list.");
	        } else {
	            System.out.println(numToSearch + " found at index " + index + " in the array list.");
	        }
	    }
}
