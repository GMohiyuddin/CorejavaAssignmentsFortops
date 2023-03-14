package coreJava;

import java.util.ArrayList;

public class Update_Arraylist_assign {
	 public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();

	        list.add("apple");
	        list.add("banana");
	        list.add("orange");
	        list.add("grape");

	        System.out.println("Original ArrayList: " + list);
	        list.set(0, "mango");

	        System.out.println("Updated ArrayList: " + list);
	    }
}
