package coreJava;

public class CompareString_Assign {
	public static void main(String[] args) {
        String str1 = "topsint.com";
        String str2 = "topsint.com";
        String str3 = "Topsint.com";
        
        
        System.out.println("Comparing Stirng 1 and String 2 : " + str1.contentEquals(str2));
        System.out.println("Comparing Stirng 2 and String 3 : "+  str2.contentEquals(str3));
    }
}
