package interfaces;

public interface AccountOperation {
	void deposit(int cash) throws NegativeValueException;

	double getBalance();
}

class InsufficientBalanceException extends Exception {
	public double amountShortage;
	public int amount;

	public InsufficientBalanceException(double d,int amount) {
		this.amountShortage = d;
		this.amount=amount;
	}
	
}

class NegativeValueException extends Exception {
}

class Account implements AccountOperation {
	private int accountNumber;
	private String ahName;
	private double balance;
	private static int minBal = 1000;

	public Account(int accountNumber, String ahName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ahName = ahName;
		this.balance = balance;
	}

	public static int getMinBal() {
		return minBal;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public void deposit(int cash) throws NegativeValueException {
		if (cash > 0)
			this.balance += cash;
		else
			throw new NegativeValueException();

	}

	public void withDraw(int amount) throws InsufficientBalanceException {
		if (this.minBal + amount<this.balance) {
			this.balance -= amount;
			System.out.println("WithDraw successfull");
		} else {
			throw new InsufficientBalanceException((this.balance-minBal)-amount,amount);
		}

	}

	@Override
	public double getBalance() {
		return this.balance;

	}

	public boolean equals(Object o) {
		Account ac = (Account) o;
		return this.accountNumber == ac.accountNumber;
	}

	@Override
	public String toString() {
		return this.ahName;
	}

	@Override
	public int hashCode() {
		return this.accountNumber;
	}
	
}