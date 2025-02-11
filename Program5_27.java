public class Program5_27 {
    public static void main(String[] args) {
        int start = 101;
        int end = 2100;

        int leapYearCount = 0;

        for (int i = start; i <= end; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + " ");
                leapYearCount++;

                // Print a newline every 10 leap years
                if (leapYearCount % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n\nThere are " + leapYearCount + " leap years between " + start + " and " + end);
    }
}
