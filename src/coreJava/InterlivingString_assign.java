package coreJava;

public class InterlivingString_assign {
	 public static void main(String[] args) {
	        String str1 = "CD";
	        String str2 = "TF";
	        findInterleavings(str1, str2, "");
	    }

	 public static void findInterleavings(String str1, String str2, String interleaved) {
	        if (str1.length() == 0 && str2.length() == 0) {
	            System.out.print(interleaved + " ");
	        } else {
	            if (str1.length() > 0) {
	                findInterleavings(str1.substring(1), str2, interleaved + str1.charAt(0));
	            }
	            if (str2.length() > 0) {
	                findInterleavings(str1, str2.substring(1), interleaved + str2.charAt(0));
	            }
	        }
	    }
}
