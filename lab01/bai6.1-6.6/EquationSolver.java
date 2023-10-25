package minipj;
import java.util.Scanner;
public class EquationSolver {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of equation to solve:");
        System.out.println("1. First-degree equation with one variable");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveFirstDegreeEquation();
                break;
            case 2:
                solveLinearSystem();
                break;
            case 3:
                solveSecondDegreeEquation();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void solveFirstDegreeEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Invalid input. 'a' should not be zero for a first-degree equation.");
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }

        scanner.close();
    }

    private static void solveLinearSystem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the values of a11, a12, b1, a21, a22, b2 (separated by spaces): ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double det = a11 * a22 - a12 * a21;

        if (det != 0) {
            double x1 = (b1 * a22 - b2 * a12) / det;
            double x2 = (a11 * b2 - a21 * b1) / det;
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (a11 / a21 == b1 / b2) {
                System.out.println("Infinite solutions (System is dependent)");
            } else {
                System.out.println("No solution (System is inconsistent)");
            }
        }

        scanner.close();
    }

    private static void solveSecondDegreeEquation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the values of a, b, c (separated by spaces): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Invalid input. 'a' should not be zero for a second-degree equation.");
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two distinct real roots: root1 = " + root1 + ", root2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: root = " + root);
        } else {
            System.out.println("No real roots (Complex roots)");
        }

        scanner.close();
    }
}
