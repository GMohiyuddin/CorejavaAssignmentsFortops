package coreJava;

public class MultipleCatch_Assign {
	 public static void main(String[] args) {
	        int[] a = new int[5];
	        try {
	            a[5] = 30 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Divide by zero error occurred");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index out of bounds error occurred");
	        }
	    }
}
