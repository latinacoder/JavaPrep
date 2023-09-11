package Section6.ReadingUserInput;


import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        //initialize the variables

        Scanner scanner = new Scanner(System.in); //scanner object

        int count = 1; //tracks count of valid integers
        double sum = 0; // tracks sum of integers

        while (count <= 5){
            System.out.println("Enter number #" + count + ":");
            String nextNumber = scanner.nextLine(); // get data from console as a string and place inside variable called nextNumber
            //after it gets the input from the user, we want to include some error handling before moving on with the count

            try {
                double number = Double.parseDouble(nextNumber);
                count++;
                sum += number;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            } //close catch

        } // close while

        System.out.println("The sum of the 5 numbers is: " + sum);
    }

}
