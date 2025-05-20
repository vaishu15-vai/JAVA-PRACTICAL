// BankAccount.java
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Default constructor
    BankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = "000000";
        this.balance = 0.0;
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = "000000";
        this.balance = 0.0;
        System.out.println("Constructor with accountHolder called");
    }

    // Constructor with two parameters
    BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        System.out.println("Constructor with accountHolder and accountNumber called");
    }

    // Constructor with all parameters
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Constructor with all parameters called");
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("----------------------------");
    }
}
