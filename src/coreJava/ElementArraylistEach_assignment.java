package coreJava;

import java.util.ArrayList;

public class ElementArraylistEach_assignment {
	public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at position " + i + ": " + colors.get(i));
        }
    }
}
