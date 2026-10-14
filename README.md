# Summit Bank 🏦
### Java Console Banking Application

Summit Bank is a Java-based console banking application developed to practice object-oriented programming (OOP) fundamentals and interactive application design.

The project simulates basic banking operations through a menu-driven interface, allowing users to manage checking and savings accounts.

## Features

- **View Account Balances:** Display account owners, account numbers, and current balances.
- **Deposit Money:** Deposit funds into checking or savings accounts.
- **Withdraw Money:** Withdraw funds while following account-specific rules.
- **Checking Account Minimum:** Maintain a minimum balance of $100.
- **Savings Interest:** Apply a 5% interest rate to the current savings balance.
- **Interactive Menu:** Navigate banking operations using a console-based interface.
- **Exit Application:** Close the program through the main menu.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Scanner
- Console-based user interaction

## Java Concepts Demonstrated

- Classes and objects
- Constructors
- Inheritance
- Abstract classes
- Method overriding
- Polymorphism
- Encapsulation of banking operations in account classes
- Conditional statements
- Switch statements
- Do-while loops
- Methods and user input

## Project Structure

```text
summit-bank-java/
├── Main.java
├── Account.java
├── CheckingsAccount.java
├── SavingsAccount.java
└── README.md
```

**Main.java:** Runs the interactive banking menu and handles user selections.

**Account.java:** Defines shared account properties and deposit/withdrawal operations through an abstract parent class.

**CheckingsAccount.java:** Extends the Account class and enforces a $100 minimum balance for withdrawals.

**SavingsAccount.java:** Extends the Account class and provides a method for applying 5% interest.

## Example Menu

```text
========== SUMMIT BANK ==========
1. View Account Balances
2. Deposit Money
3. Withdraw Money
4. Apply Savings Interest
5. Exit
=================================
Enter your choice:
```

## How to Run

1. Download or clone this repository.
2. Open the Java files in an IDE or Java development environment.
3. Ensure a compatible Java Development Kit (JDK 17 or newer) is installed.
4. Compile the Java files.
5. Run the `Main` class.
6. Follow the on-screen menu to interact with the banking system.

The application can also be run in an online Java environment that supports multiple source files, such as OnlineGDB.

## Current Limitations

- Account data is stored in memory and resets when the application restarts.
- Accounts are predefined for demonstration purposes.
- Non-numeric input is not yet handled.
- This is an educational simulation
