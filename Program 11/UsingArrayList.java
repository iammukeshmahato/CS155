import java.util.ArrayList;
import java.util.Date;

public class UsingArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList of type Integer
        ArrayList<Object> list = new ArrayList<>();

        // Creating objects of Loan and Circle
        Loan loan = new Loan(1000, 5.5);
        Circle circle = new Circle(5.0);
        Date date = new Date();
        String helloText = "Hello, World!";

        // Adding objects to the ArrayList
        list.add(loan);
        list.add(circle);
        list.add(date);
        list.add(helloText);

        // Displaying the objects in the ArrayList
        System.out.println("The objects in the ArrayList are:");
        for(Object obj : list) {
            System.out.println(obj.toString());
        }

    }

}
