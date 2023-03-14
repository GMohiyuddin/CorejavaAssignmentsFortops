package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashset_assign {
	 public static void main(String[] args) {
	      
	      HashSet<String> set = new HashSet<String>();
	      
	      set.add("apple");
	      set.add("banana");
	      set.add("orange");
	      set.add("pear");
	      
	      System.out.println("Using enhanced for loop:");
	      for (String s : set) {
	         System.out.println(s);
	      }
	      System.out.println("Using iterator:");
	      Iterator<String> iterator = set.iterator();
	      while (iterator.hasNext()) {
	         System.out.println(iterator.next());
	      }
	   }
}
