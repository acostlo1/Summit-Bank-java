public class CheckingsAccount extends Account {

	CheckingsAccount(String owner, int accountNumber, double balance) {
		super(owner, accountNumber, balance);

	}
	@Override
	public void withdraw(double withdrawAmount) {
	    
		if (balance - withdrawAmount < 100) {
			System.out.println("Rejected - account must have minimum balance of $100");
		} else if (withdrawAmount <= 0) {
		    System.out.println("Unable to withdraw a negative amount.");
		    System.out.println();
		} else {
		    this.balance -= withdrawAmount;
			System.out.printf("Success! Your new balance is: $%.2f", balance);
			System.out.println();
		}

	}
}
