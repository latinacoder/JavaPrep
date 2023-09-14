public class Main {
    public static void main(String[] args) {

        //new object:
        Employee joe = new Employee("Joe", "11/11/1990", "06/15/2023");
        System.out.println(joe);
        //Print Object Methods: getAge() and collectPay()
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());

        //new object for SalariedEmployee:
        SalariedEmployee jess = new SalariedEmployee("Jess", "09/15/1991", "09/15/2023", 90000);
        //Print new Object Fields:
        System.out.println(jess);
        System.out.println("Jess' bi-weekly paycheck = $ " + jess.collectPay());
        jess.retire();
        System.out.println("Jess' pension check = $" + jess.collectPay());

        //new object for HourlyEmployee:
        HourlyEmployee mary = new HourlyEmployee("Mary", "01/01/2000", "05/05/2023", 15);
        System.out.println(mary);
        //print HourlyEmployee methods:
        System.out.println("Mary's paycheck = $" +mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }
} // close MAIN

public class Worker {
    private String name;
    private String birthdate;
    protected String endDate; // The endDate will get set by a method in this class or a subclass

    // Constructors:

    // No-arguments constructor:
    public Worker(){

    }

    // Constructor with name and birthdate arguments:
    public Worker(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    // Methods:

    // Method to calculate the age of the worker:
    public int getAge(){
        int currentYear = 2023; // Hardcoding the current year
        int birthYear = Integer.parseInt(birthdate.substring(6)); // Extract the birth year from the birthdate

        return (currentYear - birthYear); // Calculate and return the age
    }

    // Method to calculate the worker's pay (returns 0.0 for now, needs implementation):
    public double collectPay(){
        return 0.0;
    }

    // Method to terminate the worker and set the endDate:
    public void terminate(String endDate){
        this.endDate = endDate;
    }

    // Generate the toString() method for Worker class:
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
// close Worker Class
