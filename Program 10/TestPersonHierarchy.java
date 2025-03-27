
// Test Program
public class TestPersonHierarchy {
    public static void main(String[] args) {
        Person person = new Person("Mukesh Mahato", "505 Washington Ave", "123-456-7890", "mukesh@example.com");
        Student student = new Student("Subesh Raj Pandey", "3 Village Dr", "987-654-3210", "subesh@example.com", Student.SENIOR);
        Employee employee = new Employee("Dipesh Singh", "65 N Hanover", "555-555-5555", "dipesh@example.com", "Office 101", 50000, new MyDate(2024, 1, 1));
        Faculty faculty = new Faculty("Deepak Sah", "111 UC", "111-222-3333", "deepak@example.com", "Office 111", 75000, new MyDate(2025, 1, 1), "9AM - 5PM", "Professor");
        Staff staff = new Staff("Sumit Raj", "222 UC", "444-333-2222", "sumit@example.com", "Office 222", 45000, new MyDate(2023, 1, 1), "Administrative Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}