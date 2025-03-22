// Showing array in reverse order

import java.util.Scanner;

public class Program7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int[] numbers = new int[SIZE];

        System.out.printf("Enter %d numbers: ", SIZE);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();

        // print the array in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
