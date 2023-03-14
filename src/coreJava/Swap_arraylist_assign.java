package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_arraylist_assign {
	 public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);
	        
	        System.out.println("Original ArrayList: " + numbers);
	        
	        Collections.swap(numbers, 1, 3);
	        
	        System.out.println("ArrayList after swapping elements: " + numbers);
	    }
}
