import java.util.Scanner;

public class Program4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your SSN: ");
        String ssn = sc.nextLine();
        sc.close();

        // ssn format = 111-22-3333

        if (ssn.length() == 11) {
            if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
                // if there is dash at specific index the bool value is true.
                boolean isValid = true;

                // looping throught the ssn numbers
                for (int i = 0; i < ssn.length(); i++) {
                    if (i == 3 || i == 6) {
                        continue;
                    }

                    // checking if there is digit in ssn
                    if (!Character.isDigit(ssn.charAt(i))) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    System.out.println("SSN number is valid");
                } else {
                    System.out.println("Invalid SSN number. It should be digits");
                }

            } else {
                System.out.println("Invalid SSN Patter. It should be like xxx-xx-xxxx");
            }
        } else {
            System.out.println("Invalid input. Inputs should be 9 digits and 2 dash");
        }
    }
}