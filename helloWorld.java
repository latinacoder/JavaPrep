//Section 1, 2, 3, 4:
public class Hello { //main class

    public static void main(String[]args) { //main method
        System.out.println("Hello, Jess");

        //first conditional
        boolean isAlien = false; //assignment operator to assign a value to variable
        if (isAlien == false) {//equality operator for conditionals
            System.out.println("It is not alien!");
            System.out.println("I'm scared of aliens!");
        }

        //second conditional
        int topScore = 80;
        if(topScore <= 100) {
            System.out.println("you get the high score!");
        }

        //third conditional
        int secondTopScore = 79;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        //fourth conditional
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of these conditions are true");
        }

        //fifth conditional
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an if statement");
        }

        //sixth conditional
        boolean isCar = false;
        if(isCar){ //also means if(isCar == true)  //(!isCar means isCar == false)
            System.out.println("This is not supposed to happen");
        }

        //ternary operator: Ternary is a way to replace an if-else statement
        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        //Boolean ternary
        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");

        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        //Challenge:
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;

        double firstComputation = ((firstVariable + secondVariable) * 100.00d);
        System.out.println("Solution to Step 3 is: " + firstComputation);

        double remainderOne = (firstComputation % 40.00d);
        System.out.println("Solution to Step 4 is: " + remainderOne);

        boolean isNoRemainder = (remainderOne == 0) ? true : false;
        System.out.println("isNoRemainder " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("There is a remainder");
        }





    }//close main method
} //close class
