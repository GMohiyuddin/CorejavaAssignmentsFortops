package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Convert_hashset_arraylist_assign {
	public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("ball");
        set.add("book");
        set.add("Janfo");
        set.add("tripsk");
        System.out.println("HashSet: " + set);

        // Converting HashSet to ArrayList
        List<String> list = new ArrayList<String>(set);
        System.out.println("ArrayList: " + list);
    }
}
