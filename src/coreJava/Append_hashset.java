package coreJava;

import java.util.HashSet;

public class Append_hashset {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("apple");
		set.add("bannana");
		set.add("cat");
		set.add("dogecoin");
		
		System.out.println("hashset before adding " + set);
		
		
		set.add("elephant");
		
		System.out.println("hashset after append " + set);
	}
	
}
