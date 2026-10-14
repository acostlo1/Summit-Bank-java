import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CheckingsAccount checkingsAccount1 = new CheckingsAccount("Lorenzo", 1001, 500);
		SavingsAccount savingAccount1 = new SavingsAccount("Alex", 1002, 1500);

		int choice;
		int choice2;
		int choice3;

		do {
		    System.out.println();
			System.out.println("""
			                   ========== SUMMIT BANK ==========
			                   1. View Account Balances
			                   2. Deposit Money
			                   3. Withdraw Money
			                   4. Apply Savings Interest
			                   5. Exit
			                   ================================= """);
			                           System.out.print("Enter your choice: ");
			                           choice = scanner.nextInt();
			                           System.out.println();

			switch(choice) {
		        case 1 -> { System.out.println(" ***** ACCOUNT BALANCES *****");
                            System.out.println();
                            System.out.println(" ===== CHECKINGS ACCOUNT ====");
                            System.out.println();
                            System.out.println("CHECKING ACCOUNT");
                            System.out.println("Owner: " + checkingsAccount1.owner);
                            System.out.println("Account Number: #" + checkingsAccount1.accountNumber);
                            System.out.printf("Balance: $%.2f", checkingsAccount1.balance);
                            System.out.println();
                            System.out.println();
                            
                            System.out.println(" ===== SAVINGS BALANCES =====");
                            System.out.println();
                            System.out.println("SAVINGS ACCOUNT");
                            System.out.println("Owner: " + savingAccount1.owner);
                            System.out.println("Account Number: #" + savingAccount1.accountNumber);
                            System.out.printf("Balance: $%.2f", savingAccount1.balance);
                            System.out.println();
                            System.out.println();
                            break;

		        }            
		        case 2 -> { System.out.println("""
		                            ===== DEPOSIT MONEY =====

                                    1. Checking
                                    2. Savings
                                    3. Cancel""");
                         System.out.print("Select Account: ");
                         choice2 = scanner.nextInt();
                         
                         if (choice2 == 1) {
                             System.out.println();
                             System.out.print("How much would you like to deposit?: ");
                             double checkingAmount = scanner.nextDouble();
                             checkingsAccount1.deposit(checkingAmount);
                             System.out.println();
                             break;
                             
                         } else if (choice2 == 2) {
                             System.out.println();
                             System.out.print("How much would you like to deposit?: ");
                             double savingAmount = scanner.nextDouble();
                             savingAccount1.deposit(savingAmount);
                             System.out.println();
                             break;
                             
                         } else if (choice2 == 3) {
                             break;
                         } else {
                             System.out.println("Invalid Selection.");
                             System.out.println();
                             break;
                         }
		        }
                case 3 -> { System.out.println("""
		                            ===== WITHDRAW MONEY =====

                                    1. Checking
                                    2. Savings
                                    3. Cancel""");  
                        System.out.print("Select Account: ");
                        choice3 = scanner.nextInt();
                        
                        if (choice3 == 1) {
                            System.out.println();
                             System.out.print("How much would you like to withdraw?: ");
                             double checkingAmount = scanner.nextDouble();
                             checkingsAccount1.withdraw(checkingAmount);
                             System.out.println();
                             break;
                             
                         } else if (choice3 == 2) {
                             System.out.println();
                             System.out.print("How much would you like to withdraw?: ");
                             double savingAmount = scanner.nextDouble();
                             savingAccount1.withdraw(savingAmount);
                             System.out.println();
                             break;
                             
                         } else if (choice3 == 3) {
                             break;
                         } else {
                             System.out.println("Invalid Selection.");
                             break;
                         }
                }
                case 4 -> { System.out.println("===== SAVINGS INTEREST =====");
                System.out.println();
                            System.out.printf("Current Savings Balance: $%.2f", savingAccount1.balance);
                            System.out.println();
                            System.out.println("Interest Rate: " + savingAccount1.interestRate);
                            
                            savingAccount1.applyInterest();
                            System.out.println();
                            break;
				} 
				
				case 5 -> { System.out.println("Thank you for banking with Summit Bank!");
				    
				} default -> System.out.println("Invalid Selection. Please try again.");
			}
		} while (choice != 5);
		
		System.out.println();
		System.out.println("Goodbye!");

		scanner.close();
		}
	}
