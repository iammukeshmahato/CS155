// 6.5 (Sort three numbers) Write a method with the following header to display three numbers in
// increasing order: public static void displaySortedNumbers( double num1, double num2, double num3)
// VideoNote Reverse an integer Write a test program that prompts the user to enter three numbers and
// invokes the method to display them in increasing order.

public class Program6_5 {

    public static void main(String[] args) {
        displaySortedNumbers(3, 2.4, 5);
        displaySortedNumbers(8, 4.6, 9.2);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }

}
