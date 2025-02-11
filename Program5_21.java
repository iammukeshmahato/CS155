import java.util.Scanner;

public class Program5_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the loan amount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        sc.close();

        System.out.println("\nInterest Rate\tMonthly Payment\tTotal Payment\n");

        for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125) {
            double monthlyInterestRate = annualInterestRate / 1200;

            double monthlyPayment = loanAmount * monthlyInterestRate
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%-1.3f%%\t%-1.2f\t%-1.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }
    }
}
