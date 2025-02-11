public class Program5_15 {

    public static void main(String[] args) {
        int start = 33; // ASCII value of '!'
        int end = 126;  // ASCII value of '~'

        for (int i = start; i <= end; i++) {
            System.out.print((char)i + " ");
            if ((i - start + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();   // Print a newline at the end
    }
}