//////////MAIN//////////
/*
POLYMORPHISM: many forms
This challenge:
- Have our runtime code execute different behavior, for different objects
*/
public class Main {
    public static void main(String[] args) {
        // Create instances of different types of cars
        Car car = new Car("2022 Blue Ferrari 296 GTS"); // Create a regular Car
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6); // Create a GasPoweredCar
        runRace(ferrari);

        Car tesla = new ElectricCar("2023 Red Tesla Model 4", 568, 75); // Create an ElectricCar
        runRace(tesla);

        Car audi = new HybridCar("New audi", 500, 60, 80); // Create a HybridCar
        runRace(audi);
    }

    // Method that takes a Car parameter and demonstrates polymorphism
    public static void runRace(Car car) {
        car.startEngine(); // Start the car's engine (polymorphic behavior)
        car.drive(); // Drive the car (polymorphic behavior)
        // The actual behavior of drive() depends on the specific type of car object
    }
}


///////CLASS: CAR.JAVA ///////////
// PUBLIC CLASS: CAR
public class Car {

    // Field to store the car's description
    private String description;

    // Constructor to initialize the car's description
    public Car(String description) {
        this.description = description;
    }

    // Method for starting the car's engine
    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    // Protected method for running the car's engine
    // Subclasses can override, but other classes not sharing the same package cannot
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    // Method for driving the car
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

// New Class for Gas Powered Car
class GasPoweredCar extends Car {

    // Fields specific to GasPoweredCar
    private double avgKmPerLiter;
    private int cylinders = 6;

    // Constructors for GasPoweredCar
    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    // Override the startEngine() method
    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready! %n", cylinders);
    }

    // Override the runEngine() method
    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

// New Class for ElectricCar
class ElectricCar extends Car {

    // Fields specific to ElectricCar
    private double avgKmPerCharge;
    private int batterySize = 6;

    // Constructors for ElectricCar
    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    // Override the startEngine() method
    @Override
    public void startEngine() {
        System.out.printf("Electric Car -> switch %d kWh battery on, Ready !%n", batterySize);
    }

    // Override the runEngine() method
    @Override
    protected void runEngine() {
        System.out.printf("Electric Car -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

// New Class for HybridCar
class HybridCar extends Car {

    // Fields specific to HybridCar
    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    // Constructors for HybridCar
    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    // Override the startEngine() method
    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> switch %d cylinders are fired up. %n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready !%n", batterySize);
    }

    // Override the runEngine() method
    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}

