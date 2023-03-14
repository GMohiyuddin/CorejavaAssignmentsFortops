package coreJava;

import java.util.ArrayList;

public class adding_two_arraylist_assgn {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("mobile");
		list.add("laptop");
		list.add("alexa");
		list.add("tv");
		list.add("remort");
		
		ArrayList<String> list2 = new ArrayList<String>();
		for (String st : list) {
			list2.add("teapost");
		}
		System.out.println("list1 is " + list);
		System.out.println("list2 is " + list2);
	}
}
