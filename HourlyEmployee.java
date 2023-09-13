public class HourlyEmployee extends Employee {

    // Field specific to HourlyEmployee
    private double hourlyPayRate;

    // Constructor:
    public HourlyEmployee(String name, String birthdate, String hireDate, double hourlyPayRate) {
        super(name, birthdate, hireDate); // Call the constructor of the parent class (Employee)
        this.hourlyPayRate = hourlyPayRate; // Initialize the hourly pay rate field
    }

    // Override the collectPay() method to calculate the pay for an hourly employee
    @Override
    public double collectPay() {
        return 40 * hourlyPayRate; // Calculate the weekly pay based on a 40-hour workweek
    }

    // Method to calculate double pay (time and a half)
    public double getDoublePay() {
        return 2 * collectPay(); // Calculate and return double pay (2 times the regular pay)
    }
}
