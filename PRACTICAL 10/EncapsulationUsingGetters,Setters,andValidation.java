
class BankAccount {

    // Private data members
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    // Display account details
    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating BankAccount object
        BankAccount account = new BankAccount("Rahul", 101, 5000);

        System.out.println("Initial Account Details:");
        account.display();

        System.out.println("\nPerforming Transactions:");

        // Valid deposit
        account.deposit(2000);

        // Invalid negative deposit
        account.deposit(-500);

        // Valid withdrawal
        account.withdraw(1000);

        // Invalid zero withdrawal
        account.withdraw(0);

        // Invalid negative withdrawal
        account.withdraw(-200);

        // Withdrawal greater than balance
        account.withdraw(10000);

        // Display updated balance
        System.out.println("\nFinal Account Details:");
        account.display();
    }
}
