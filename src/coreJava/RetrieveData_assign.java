package coreJava;

import java.util.ArrayList;

public class RetrieveData_assign {
	public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");

        String fruit = fruits.get(2);
        System.out.println("Element at index 2: " + fruit);
    }
}
