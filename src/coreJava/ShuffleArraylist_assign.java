package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArraylist_assign {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");

        System.out.println("Original list: " + list);

        Collections.shuffle(list);

        System.out.println("Shuffled list: " + list);
    }
}
