import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorWithException {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double operand1 = 0;
        double operand2 = 0;
        String operator;

        try {
            System.out.print("Enter First number: ");
            operand1 = input.nextDouble();

            System.out.print("Enter Second number: ");
            operand2 = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = input.next();

            double result;

            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("Math error: Cannot divide by zero.");
                        return;
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Invalid operator. Use +, -, *, or /.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (

        // InputMismatchException is thrown when the user enters a non-numeric value

        InputMismatchException e) {
            System.out.println("Wrong operand type: Please enter valid numbers.");
        } finally {
            input.close();
        }
    }
}
