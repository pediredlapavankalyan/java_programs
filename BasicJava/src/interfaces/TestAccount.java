package interfaces;

public class TestAccount {

	public static void main(String[] args) {
		Account ac = new Account(123, "pavan", 10000);
		try {
			ac.withDraw(20000);
		} catch (InsufficientBalanceException e) {
			System.err.println("Insufficient Balance "+e.amountShortage +
					" withdraw of "+e.amount);
			
		}

	}

}
