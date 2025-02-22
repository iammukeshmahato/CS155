// 6.9 (Conversions between feet and meters) Write a class that contains the following two methods: /**
// Convert from feet to meters */ public static double footToMeter(double foot) /** Convert from meters
// to feet */ public static double meterToFoot(double meter) The formula for the conversion is: meter =
// 0.305 * foot foot = 3.279 * meter Write a test program that invokes these methods to display the
// following tables:
// Feet Meters | Meters Feet
// 1.0 0.305 |
// 20.0 65.574 2.0 0.610
// | 25.0 81.967 ... 9.0 2.745 |
// 60.0 196.721 10.0 3.050 |
// 65.0 213.11


public class Program6_9 {
    
    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-------------------------------");
        for (double i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f\n", i, footToMeter(i), j, meterToFoot(j));
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
