/* ABOUT THE COMPOSITION CHALLENGE:
, this code demonstrates the concept of building a complex system (a smart kitchen) by composing it from simpler components (kitchen appliances) using classes and objects in Java. It follows principles of encapsulation and separation of concerns, making the code modular and maintainable.
*/
/////////////////////////////////////////////////////////////////////////////////   MAIN   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen  = new SmartKitchen();

//        //setters. First set to Methods to true in order get an output
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//
//        //calling methods with Get:
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();


        /*SmartKitchen can manage all its appliance and inner workings, simplifying what the inner code needs to do
        allowing the SmartKitchen to control the state of its appliances.*/

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

    }
}

/////////////////////////////////////////////////////////////////////////////////   CLASS   /////////////////////////////////////////////////////////////////////////////////////////////
public class SmartKitchen {
    private CoffeeMaker brewMaster; // Declare an instance of CoffeeMaker as a component
    private Refrigerator iceBox; // Declare an instance of Refrigerator as a component
    private Dishwasher dishWasher; // Declare an instance of Dishwasher as a component

    // Constructor for SmartKitchen
    public SmartKitchen() {
        // Initialize instances of kitchen appliances when a SmartKitchen object is created
        brewMaster = new CoffeeMaker(); // Create a CoffeeMaker object
        iceBox = new Refrigerator(); // Create a Refrigerator object
        dishWasher = new Dishwasher(); // Create a Dishwasher object
    }

    // Generate Getters for each appliance instance | FOR ACCESS
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public Dishwasher getDishWasher() {
        return dishWasher;
    }

    // A method to set the hasWorkToDo flag for each appliance
    // This method allows controlling the state of multiple appliances at once
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        // Set the hasWorkToDo flags for each appliance based on the input
        brewMaster.setHasWorkToDo(coffeeFlag); // Set CoffeeMaker's work flag
        iceBox.setHasWorkToDo(fridgeFlag); // Set Refrigerator's work flag
        dishWasher.setHasWorkToDo(dishWasherFlag); // Set Dishwasher's work flag
    }

    // A method to perform kitchen work using the appliances
    public void doKitchenWork() {
        // Perform tasks for each appliance if it has work to do
        brewMaster.brewCoffee(); // Brew coffee if CoffeeMaker has work
        iceBox.orderFood(); // Order food if Refrigerator has work
        dishWasher.doDishes(); // Do dishes if Dishwasher has work
    }
} // close SmartKitchen Class

// COFFEEMAKER CLASS
class CoffeeMaker {

    // Fields:
    private boolean hasWorkToDo;

    // Setter method to change the hasWorkToDo flag
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    // Method to brew coffee if there is work to do
    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false; // Mark the work as done
        }
    } // close brewCoffee()

} // close CoffeeMaker Class

// REFRIGERATOR CLASS
class Refrigerator {

    // Fields:
    private boolean hasWorkToDo;

    // Setter method to change the hasWorkToDo flag
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    // Method to order food if there is work to do
    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false; // Mark the work as done
        }
    } // close orderFood()

} // close Refrigerator Class

// DISHWASHER CLASS
class Dishwasher {
    // Fields:
    private boolean hasWorkToDo;

    // Setter method to change the hasWorkToDo flag
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    // Method to do dishes if there is work to do
    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing Dishes");
            hasWorkToDo = false; // Mark the work as done
        }
    } // close doDishes()

} // close Dishwasher Class

