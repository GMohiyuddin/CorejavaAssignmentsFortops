package coreJava;

import java.util.ArrayList;

public class add_in_arraylist {
	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<>();
		
		color.add("red");
		color.add("yellow");
		color.add("green");
		
		color.add(0	, "blue");
		
		System.out.println("arraylist after inserting element: ");
		
		for (String color1 : color) {
			System.out.println(color1);
		}
	}
}
