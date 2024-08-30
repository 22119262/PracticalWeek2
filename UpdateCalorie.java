import java.util.Scanner;

public class CalorieWatcher {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Constants
        final int TOTAL_COOKIES = 40;
        final int SERVINGS = 10;
        final int CALORIES_PER_SERVING = 300;
        int numberCookies = -1;

        // Prompt the user for the number of cookies eaten with validation
        do {
            System.out.print("Enter the number of cookies eaten (0 to 40): ");
            if (scanner.hasNextInt()) {
                numberCookies = scanner.nextInt();
                if (numberCookies < 0 || numberCookies > TOTAL_COOKIES) {
                    System.out.println("Invalid input. Please enter a number between 0 and 40.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        } while (numberCookies < 0 || numberCookies > TOTAL_COOKIES);

        // Calculate servings consumed
        double servingsConsumed = (double) numberCookies / TOTAL_COOKIES * SERVINGS;

        // Calculate total calories consumed
        double totalCalories = servingsConsumed * CALORIES_PER_SERVING;

        // Display the result
        System.out.println("You consumed " + totalCalories + " calories when you ate " + numberCookies + " cookies.");

        // Close the scanner
        scanner.close();
    }
}
