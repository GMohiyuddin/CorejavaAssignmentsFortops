package coreJava;

import java.util.HashSet;

public class HashsetSize_assign {
	public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        
        // add elements to the hash set
        hashSet.add("orange");
        hashSet.add("banana");
        hashSet.add("tooth");
        hashSet.add("grape");
        hashSet.add("baskent");
        
        int size = hashSet.size();
        
        System.out.println("Number of elements in the hash set: " + size);
    }
}
