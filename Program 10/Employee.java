
// Employee class
class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary,
            MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Office: " + this.office + ", Hire Data: " + this.dateHired + ", Salary: " + this.salary
                + ", " + super.toString();
    }
}
