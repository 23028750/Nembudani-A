import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal, interestRate, timeInYears;

        // Get user input with error handling
        while (true) {
            System.out.print("Enter the principal amount: R");
            principal = scanner.nextDouble();

            if (principal <= 0) {
                System.out.println("Invalid input. Principal amount must be positive.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Enter the interest rate (%): ");
            interestRate = scanner.nextDouble();

            if (interestRate < 0) {
                System.out.println("Invalid input. Interest rate must be a positive number.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Enter the time in years: ");
            timeInYears = scanner.nextDouble();

            if (timeInYears <= 0) {
                System.out.println("Invalid input. Time in years must be greater than 0");
            } else {
                break;
            }
        }

        // Convert interest rate to decimal for calculation
        interestRate /= 100;

        // Calculate compound interest
        double amount = principal * Math.pow(1 + interestRate, timeInYears);
        double compoundInterest = amount - principal;

        // Display results with formatted output
        System.out.printf("Principal amount: R%.2f\n", principal);
        System.out.printf("Interest rate: %.2f%%\n", interestRate * 100);
        System.out.printf("Time in years: %.2f\n", timeInYears);
        System.out.printf("Compound interest: R%.2f\n", compoundInterest);
        System.out.printf("Total amount: R%.2f\n", amount);

        scanner.close();
    }