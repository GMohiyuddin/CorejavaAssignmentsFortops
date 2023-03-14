package coreJava;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            int requiredBalance = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + requiredBalance + " Rs. To perform this transaction.");
        }
        balance -= amount;
        System.out.println(amount + " Rs. successfully withdrawn. Current balance: " + balance + " Rs.");
    }
}

public class Insufficientbal_Assign {
	public static void main(String[] args) {
        Account account = new Account(2000);
        int withdrawAmount = 2500;

        try {
            account.withdraw(withdrawAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
