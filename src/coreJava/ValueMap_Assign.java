package coreJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValueMap_Assign {
	public static void main(String[] args) {
        
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        Collection<String> values = map.values();
        
        System.out.println("Values: " + values);
    }
}
