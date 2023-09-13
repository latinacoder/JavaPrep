public class SalariedEmployee extends Employee {

    // Fields specific to SalariedEmployee
    double annualSalary;
    boolean isRetired; // Default is false

    // CONSTRUCTOR:
    public SalariedEmployee(String name, String birthdate, String hireDate, double annualSalary) {
        super(name, birthdate, hireDate); // Call the constructor of the parent class (Employee)
        this.annualSalary = annualSalary; // Initialize the annual salary field
    }

    // Override the collectPay() method to calculate the salary payment for a salaried employee
    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26; // Calculate the biweekly paycheck
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck; // If the salaried employee is retired, adjust pay, else give full paycheck
        return (int) adjustedPay; // Return the adjusted pay as an integer (rounded)
    }

    // The retire() method is in the grandparent (base) class (Worker).
    // As long as the parent class (Employee) doesn't override its parent's (Worker) methods,
    // this method can be called from the descendants.
    public void retire() {
        terminate("12/12/2050"); // Call the terminate() method from the parent class
        isRetired = true; // Set the retirement flag to true
    }
}
