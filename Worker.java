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
