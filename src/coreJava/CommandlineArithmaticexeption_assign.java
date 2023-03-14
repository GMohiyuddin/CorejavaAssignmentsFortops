package coreJava;

public class CommandlineArithmaticexeption_assign {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("plz enter two number as comandline arguments");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		try {
			int result = num1/num2;
			System.out.println("result is " + result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exceotion generated " + e);
			System.out.println("cant devided by zero");
		}
		
	}
}
