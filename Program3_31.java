import java.util.Scanner;

class Program3_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Exchange\n0: U.S. Dollars to Chinese RMB\n1: Chinese RMB to U.S. Dollar");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 0) {
            System.out.print("Enter the dollar amount: $");
            double dollar = sc.nextFloat();

            double rmb = dollar * 6.81;
            System.out.println("$" + dollar + " is " + rmb + " yuan");
        } else if (choice == 1) {
            System.out.print("Enter the yuan amount: ");
            double yuan = sc.nextFloat();

            double dollar = yuan / 6.81;
            System.out.println(yuan + " yuan" + " is $" + dollar);
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}