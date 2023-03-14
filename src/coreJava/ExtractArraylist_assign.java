package coreJava;

import java.util.ArrayList;
import java.util.List;

public class ExtractArraylist_assign {
	public static void main(String[] args) {
	      
	      List<String> originalList = new ArrayList<>();
	      
	      // add elements to the array list
	      originalList.add("apple");
	      originalList.add("banana");
	      originalList.add("sugarcane");
	      originalList.add("date");
	      originalList.add("raspeberry");
	      originalList.add("fig");
	      
	      // extract a portion of the array list
	      List<String> extractedList = originalList.subList(2, 5);
	      
	      // print the extracted list
	      System.out.println("Original List: " + originalList);
	      System.out.println("Extracted List: " + extractedList);
	   }
}
