public class BankApp {
    public static void main(String[] args) {
        // Using default constructor
        BankAccount acc1 = new BankAccount();
        acc1.displayDetails();

        // Using constructor with 1 parameter
        BankAccount acc2 = new BankAccount("Amit");
        acc2.displayDetails();

        // Using constructor with 2 parameters
        BankAccount acc3 = new BankAccount("Priya", "12345678");
        acc3.displayDetails();

        // Using constructor with 3 parameters
        BankAccount acc4 = new BankAccount("Ravi", "87654321", 5000.0);
        acc4.displayDetails();
    }
}
