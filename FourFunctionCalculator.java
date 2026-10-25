import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
 
        System.out.print("Enter the first integer: "); 
        int num1 = input.nextInt(); 
 
        System.out.print("Enter the second integer: "); 
        int num2 = input.nextInt(); 
 
        System.out.println("\n=== Results ==="); 
        System.out.println("Addition (+): " + (num1 + num2)); 
        System.out.println("Subtraction (-): " + (num1 - num2)); 
        System.out.println("Multiplication (*): " + (num1 * num2)); 
 
        if (num2 != 0) { 
            System.out.println("Division (/): " + (num1 / num2)); 
            System.out.println("Modulo (%): " + (num1 % num2)); 
        } else { 
            System.out.println("Division (/): Cannot divide by zero."); 
            System.out.println("Modulo (%): Cannot divide by zero."); 
        } 
 
        // Negative operand behavior: 
        // Integer division truncates toward zero. 
        // The remainder takes the sign of the first operand. 
        // Example: -10 / 3 = -3 and -10 % 3 = -1. 
        // Example: 10 / -3 = -3 and 10 % -3 = 1. 
 
        input.close(); // Good practice to close the scanner
    } 
}