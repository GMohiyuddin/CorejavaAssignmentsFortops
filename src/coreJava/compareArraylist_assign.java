package coreJava;

import java.util.ArrayList;
import java.util.Arrays;

public class compareArraylist_assign {
	 public static void main(String[] args) {
		    ArrayList<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
		    ArrayList<String> list2 = new ArrayList<>(Arrays.asList("apple", "orange", "banana"));

		    // Check if the two lists are equal
		    if (list1.equals(list2)) {
		      System.out.println("The two lists are equal.");
		    } else {
		      System.out.println("The two lists are not equal.");
		    }
		  }
}
