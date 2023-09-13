public class Employee extends Worker {

    // Instance variables specific to Employee
    private long employeeID;
    private String hireDate;

    // Static field to generate unique employee IDs
    private static int employeeNo = 1; // Static field lets you share data across all instances (objects)

    // CONSTRUCTOR:
    public Employee(String name, String birthdate, String hireDate) {
        super(name, birthdate); // Call the constructor of the parent class (Worker)

        // Generate and assign a unique employee ID using static employeeNo
        this.employeeID = Employee.employeeNo++; // Use post-increment to count employee numbers
        this.hireDate = hireDate;
    }

    // toString() method to represent an Employee as a string
    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString(); // Call the toString() method of the parent class (Worker)
    }
}
