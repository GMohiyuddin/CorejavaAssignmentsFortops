package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist_assign {
	 public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(10);
	        list.add(26);
	        list.add(45);
	        list.add(5);
	        list.add(156);

	        System.out.println("Before sorting: " + list);

	        Collections.sort(list);

	        System.out.println("After sorting: " + list);
	    }
}
