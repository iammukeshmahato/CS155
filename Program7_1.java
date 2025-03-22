import java.util.Scanner;

public class Program7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students scores do you want to enter?: ");
        int size_of_array = sc.nextInt();

        int[] scores = new int[size_of_array];

        System.out.printf("Enter all %d the scores\n", size_of_array);
        for (int i = 0; i < size_of_array; i++) {
            scores[i] = sc.nextInt();
        }

        sc.close();

        int best_score = scores[0];

        // find the best score
        for (int i = 1; i < size_of_array; i++) {
            if (scores[i] > best_score) {
                best_score = scores[i];
            }
        }

        // print the grades
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is "
                    + getGrade(scores[i], best_score));
        }
    }

    // funtion to find grades
    public static String getGrade(int score, int best_score) {
        if (score >= best_score - 10) {
            return "A";
        } else if (score >= best_score - 20) {
            return "B";
        } else if (score >= best_score - 30) {
            return "C";
        } else if (score >= best_score - 40) {
            return "D";
        } else {
            return "F";
        }
    }
}