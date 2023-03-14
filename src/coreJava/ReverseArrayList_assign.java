package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList_assign {
	 public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("apple");
	        list.add("banana");
	        list.add("cherry");
	        list.add("date");
	        list.add("elderberry");
	        System.out.println("Original list: " + list);

	        Collections.reverse(list);
	        System.out.println("Reversed list: " + list);
	    }
}
