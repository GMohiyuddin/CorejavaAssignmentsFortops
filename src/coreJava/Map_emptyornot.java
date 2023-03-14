package coreJava;

import java.util.HashMap;
import java.util.Map;

public class Map_emptyornot {
	public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // adding key-value mappings to the map
        map.put("key1", "value1");
        map.put("key2", "value2");

        // checking if map is empty or not
        if (map.isEmpty()) {
            System.out.println("Map is empty!");
        } else {
            System.out.println("Map is not empty!");
        }
    }
}
