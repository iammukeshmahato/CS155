import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question 2.15

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // distance formula
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double s = (side1 + side2 + side3) / 2; // semi-perimeter

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.printf("The area of the triangle is %.2f \n", area);

        // Question 2.17
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F): ");
        double ta = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour (greater than or equal to 2 mph): ");
        double v = input.nextDouble();

        input.close();

        if (ta >= -58 && ta <= 41 && v >= 2) {
            double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
            System.out.printf("The wind chill index is %.2f\n", twc);
        } else {
            System.out.println(
                    "The formula cannot be used for wind speeds below 2 mph or temperatures below -58F or above 41F");
        }
    }
}
