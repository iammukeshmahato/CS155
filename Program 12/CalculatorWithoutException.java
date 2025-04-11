import java.util.Scanner;

public class CalculatorWithoutException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double operand1, operand2;
        String operator;

        System.out.print("Enter First number: ");

        if (input.hasNextDouble()) {
            operand1 = input.nextDouble();
        } else {
            System.out.println("Wrong operand type: Please enter a valid number.");
            return;
        }

        System.out.print("Enter Second number: ");
        if (input.hasNextDouble()) {
            operand2 = input.nextDouble();
        } else {
            System.out.println("Wrong operand type: Please enter a valid number.");
            return;
        }

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next();

        input.close();

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
    }
}
