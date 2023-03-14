package coreJava;

import java.util.HashMap;
import java.util.Map;

public class HashmapSize_assign {
	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        int size = map.size();
        System.out.println("Size of the map is: " + size);
    }
}
