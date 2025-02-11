public class Program5_13 {
    public static void main(String[] args) {
        int i = 1;
        while (Math.pow(i, 3) < 12000) {
            i++;
        }

        // The loop will exit when i^3 >= 12000, so the largest number whose cube is less than 12000 is i - 1
        System.out.println("The largest number whose cube is less than 12000 is " + (i - 1));
    }
}
