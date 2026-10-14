public class SavingsAccount extends Account{
    
    double interestRate = 0.05;

    SavingsAccount(String owner, int accountNumber, double balance) {
        super(owner, accountNumber, balance);
    }
    public void applyInterest() {
        double earnedInterest;
        
        earnedInterest = balance * interestRate;
        balance += earnedInterest;
        
        System.out.println();
        System.out.printf("Your earned interest: $%.2f", earnedInterest);
        System.out.println();
        System.out.printf("Your current balance is: $%.2f", balance);
        System.out.println();
    }

}
