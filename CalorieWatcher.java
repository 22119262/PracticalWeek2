import java.util.Scanner;

public class CalorieWatcher {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Constants
        final int TOTAL_COOKIES = 40;
        final int SERVINGS = 10;
        final int CALORIES_PER_SERVING = 300;

        // Prompt the user for the number of cookies eaten
        System.out.print("Enter the number of cookies eaten: ");
        int numberCookies = scanner.nextInt();

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
