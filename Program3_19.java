import java.util.Scanner;

class Program3_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 sides of triangle: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        sc.close();

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            float perimeter = a + b + c;
            System.out.println("The perimeter of triangle: " + perimeter);
        } else {
            System.out.print("Invalid Input");
        }
    }
}