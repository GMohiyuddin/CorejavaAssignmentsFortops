package coreJava;

import java.util.ArrayList;

public class IncreaseArraylist_assign {
	 public static void main(String[] args) {
	        // create an ArrayList with initial capacity of 5
	        ArrayList<String> list = new ArrayList<>(5);
	        
	        // add some elements to the list
	        list.add("volvo");
	        list.add("mercedis");
	        list.add("audi");
	        
	        System.out.println("Current capacity: " + list.size());
	        
	        list.ensureCapacity(10);
	        
	        System.out.println("New capacity: " + list.size());
	    }
}
