package coreJava;

import java.util.ArrayList;

public class RemoveArraylist_assign {
	public static void main(String[] args) {
	   
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();

	    numbers.add(10);
	    numbers.add(20);
	    numbers.add(30);
	    numbers.add(40);
	    numbers.add(50);

	    System.out.println("Before removing the third element: " + numbers);
	    numbers.remove(2);
	    System.out.println("After removing the third element: " + numbers);
	  }
}
