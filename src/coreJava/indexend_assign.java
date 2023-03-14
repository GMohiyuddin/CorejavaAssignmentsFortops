package coreJava;

public class indexend_assign {
	public static void main(String[] args) {
        String str1 = "Java Exercises";
        String str2 = "se";
        boolean result1 = str1.endsWith(str2);
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + result1);
        String str3 = "Java Exercise";
        boolean result2 = str3.endsWith(str2);
        System.out.println("\"" + str3 + "\" ends with \"" + str2 + "\"? " + result2);
    }
}
