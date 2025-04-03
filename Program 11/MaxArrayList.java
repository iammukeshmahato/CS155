import java.util.ArrayList;
import java.util.Scanner;

public class MaxArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // creating scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers ending with 0");

        // Adding numbers to the list until 0 is entered
        while (true) {

            System.out.print("Entering number: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            // Adding the number to the list
            list.add(number);
        }

        input.close();

        System.out.println("The list is: " + list);

        System.out.println("The maximum value in the list is: " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        // Integer max = list.get(0);
        // for (Integer num : list) {
        // if (num > max) {
        // max = num;
        // }
        // }
        // return max;

        // Using the built-in max method
        return java.util.Collections.max(list);
    }
}
