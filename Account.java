public abstract class Account {

    //Parent class **abstract**

    String owner;
    int accountNumber;
    double balance;

    Account(String owner, int accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double depositAmount) {

        if (depositAmount > 0) {
            this.balance += depositAmount;
            System.out.printf("Success! Your new balance is: $%.2f%n", balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double withdrawAmount){

        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            this.balance -= withdrawAmount;
            System.out.printf("Success! Your new balance is: $%.2f%n", balance);
        } else if(withdrawAmount > balance) {
            System.out.println("Unable to withdraw greater than account balance.");
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }
}
