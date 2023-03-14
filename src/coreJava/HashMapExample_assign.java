package coreJava;

import java.util.HashMap;

public class HashMapExample_assign {
	public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add values to the HashMap
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Bob", 40);

        // Print the contents of the HashMap
        System.out.println("HashMap: " + map);
    }
}
