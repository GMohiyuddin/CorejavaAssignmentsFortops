package coreJava;

import java.util.ArrayList;

public class ColorArraylist_assign {
	 public static void main(String[] args) {
		    ArrayList<String> colors = new ArrayList<String>();
		    colors.add("red");
		    colors.add("green");
		    colors.add("blue");
		    colors.add("yellow");

		    // print out the collection
		    System.out.println("Colors in the collection:");
		    for (String color : colors) {
		      System.out.println(color);
		    }
		  }
}
