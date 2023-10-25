package minipj;
import java.util.Scanner;
public class Calculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the first number
	        System.out.print("Enter the first number: ");
	        String strNum1 = scanner.nextLine();
	        double num1 = Double.parseDouble(strNum1);

	        // Input the second number
	        System.out.print("Enter the second number: ");
	        String strNum2 = scanner.nextLine();
	        double num2 = Double.parseDouble(strNum2);

	        // Calculate and display the results
	        double sum = num1 + num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        double quotient;

	        // Check divisor for division
	        if (num2 != 0) {
	            quotient = num1 / num2;
	            System.out.println("Sum: " + sum);
	            System.out.println("Difference: " + difference);
	            System.out.println("Product: " + product);
	            System.out.println("Quotient: " + quotient);
	        } else {
	            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
	        }

	        scanner.close();
	    }
}
