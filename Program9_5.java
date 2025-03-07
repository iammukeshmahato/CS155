// 9.5 (Use the GregorianCalendar class) Java API has the GregorianCalendar class in the java.util package,
// which you can use to obtain the year, month, and day of a date. The no-arg constructor constructs an
// instance for the current date, and the methods get(GregorianCalendar.YEAR),
// get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year, month,
// and day. Write a program to perform two tasks: ■ Display the current year, month, and day. ■ The
// GregorianCalendar class has the setTimeInMillis(long), which can be used to set a specified elapsed time
// since January 1, 1970. Set the value to 1234567898765L and display the year, month, and day.

import java.util.GregorianCalendar;

public class Program9_5 {

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Current year, month, and day: ");
        System.out.println("Year: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + cal.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));

        cal.setTimeInMillis(1234567898765L);
        System.out.println("\nElapsed time since January 1, 1970 set to 1234567898765L: ");
        System.out.println("Year: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + cal.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
