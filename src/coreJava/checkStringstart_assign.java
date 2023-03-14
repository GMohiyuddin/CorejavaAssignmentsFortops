package coreJava;

public class checkStringstart_assign {
	public static void main(String[] args) {
        String str1 = "Red is favorite color.";
        String str2 = "Red";
        boolean result1 = str1.startsWith(str2);
        System.out.println("\"" + str1 + "\" starts with \"" + str2 + "\"? " + result1);
        String str3 = "Orange is also my favorite color.";
        boolean result2 = str3.startsWith(str2);
        System.out.println("\"" + str3 + "\" starts with \"" + str2 + "\"? " + result2);
    }
}
