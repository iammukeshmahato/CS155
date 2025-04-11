import java.util.InputMismatchException;
import java.util.Scanner;

public class SumWithRetry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The prompt messages are passed as arguments to the getInt method.
        int num1 = getInt(input, "Enter the first integer: ");
        int num2 = getInt(input, "Enter the second integer: ");

        System.out.println("The sum is: " + (num1 + num2));
    }

    /**
     * Prompts the user for an integer and retries if the input is invalid.
     *
     * @param scanner The Scanner object to read input.
     * @param prompt  The prompt message to display to the user.
     * @return The valid integer input from the user.
     */
    public static int getInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}
