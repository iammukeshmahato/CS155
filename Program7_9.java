// Find the smallest number in an array of double values

import java.util.Scanner;

public class Program7_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        double[] numbers = new double[SIZE];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }
        sc.close();
        System.out.println("The smallest number is: " + min(numbers));
    }

    private static double min(double[] numbers) {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
