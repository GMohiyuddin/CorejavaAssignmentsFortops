package coreJava;

import java.util.HashSet;
import java.util.Set;

public class RetailSameElement_Assign {
	public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        
        set1.retainAll(set2);
        
        System.out.println("Common elements: " + set1);
    }
}
