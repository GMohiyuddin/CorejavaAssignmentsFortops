package coreJava;
abstract class bank{
	abstract int getbalance();
	
}

class bank1 extends bank{
	private int bal = 100;
	int getbalance() {
		return bal;
	}
}

class bank2 extends bank{
	private int bal = 500;
	int getbalance() {
		return bal;
	}
}

class bank3 extends bank{
	private int bal = 3620;
	int getbalance() {
		return bal;
	}
}

public class abstract_bank_assign {
	public static void main(String[] args) {
		bank1 bank1 = new bank1 ();
		bank2 bank2 = new bank2 ();
		bank3 bank3 = new bank3 ();
		
		System.out.println("Balance in Bank 1 is $" + bank1.getbalance());
		System.out.println("Balance in Bank 2 is $" + bank2.getbalance());
		System.out.println("Balance in Bank 3 is $" + bank3.getbalance());
	}
}
