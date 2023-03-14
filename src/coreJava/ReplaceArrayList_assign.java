package coreJava;

import java.util.ArrayList;

public class ReplaceArrayList_assign {
	 public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<String>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        
	        System.out.println("Original ArrayList: " + colors);
	        
	        String newColor = "Orange";
	        colors.set(1, newColor);
	        
	        System.out.println("Updated ArrayList: " + colors);
	    }
}
