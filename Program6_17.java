// 6.17 (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the following
// header: public static void printMatrix(int n) Each element is 0 or 1, which is generated randomly. Write a
// test program that prompts the user to enter n and displays an n-by-n matrix. Here is a sample run
// Enter n: 3
// 0 1 0
// 0 0 0
// 1 1 1

public class Program6_17 {

    public static void main(String[] args) {
        printMatrix(6);
    }

    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)

                // Typecast to int to get 0 or 1
                // System.out.print((int)(Math.random() * 2) + " ");

                // Using round method
                System.out.print(Math.round(Math.random()) + " ");
            System.out.println();
        }
    }
}
