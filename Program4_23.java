import java.util.Scanner;

public class Program4_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's Name:");
        String name = sc.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = sc.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = sc.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = sc.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = sc.nextDouble();

        sc.close();

        double grossPay = hours * payRate;
        double federalWithholding = grossPay * federalTax;
        double stateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("Federal Withholding (" + (federalTax * 100) + "%): $" + federalWithholding);
        System.out.println("State Withholding (" + (stateTax * 100) + "%): $" + stateWithholding);
        System.out.println("Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}