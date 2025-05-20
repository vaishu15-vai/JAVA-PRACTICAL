import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Performing operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division;

        // Handling division by zero
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            division = Double.NaN; // Not a Number
        }

        // Displaying results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        
           
        }

        
    }

