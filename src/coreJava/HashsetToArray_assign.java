package coreJava;

import java.util.HashSet;

public class HashsetToArray_assign {
	public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("grape");

        String[] array = set.toArray(new String[set.size()]);

        for (String element : array) {
            System.out.println(element);
        }
    }
}
