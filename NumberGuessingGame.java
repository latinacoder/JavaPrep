// Step 1: Importing Libraries: import required libraries: Random and Scanner

import java.util.Random; // generates random numbers
import java.util.Scanner; // reads user input

// Step 2: Defining the Class: define NumberGuessingGame class
public class NumberGuessingGame {

    //Step 3: The `main` method, which is the entry point for our program.
    public static void main(String[] args) {

        //Step 4: Creating a Scanner object named `reader` to read user input.
        // Create a Scanner to read user input
        Scanner reader = new Scanner(System.in);

        //Step 5: Initializing variables
        // Initialize the "play" variable to "yes" to start the game
        String play = "yes";

        //Step 6: Outer While Loop (Game Replay)
        // While loop to determine if we are going to play the game again
        while (play.equals("yes")) {

            //Step 7: Generating a Random Number inside the outer loop
            // Create `Random` object named `rand` to generate random numbers.
            Random rand = new Random();

            // Generate a random number between 0 and 99 and store it in "randNum"
            int randNum = rand.nextInt(100);

            //Step 8: Initializing Game Variables:
            // Initialize "guess" to -1 and "tries" to 0
            int guess = -1;  //The key is to choose a value that won't conflict with valid guesses within the range of possible values.
            int tries = 0; // is initialized to 0 and will keep track of the number of attempts the player has made.

            // Step 9: Inner Loop (GamePlay): enter an inner `while` loop that checks if the player's `guess` is equal to  `randNum`
            // Step 10: Getting the player's guess:

            // While loop to check if the game is over
            while (guess != randNum) {
                // Prompt the user to guess a number between 1 and 100
                System.out.print("Guess a number between 1 and 100: ");
                // Read the user's guess
                guess = reader.nextInt(); // Read an integer from the console and store it in the guess variable
                // Increment the number of tries
                tries++;

                // Step 11: Check if the guess is correct
                if (guess == randNum) {
                    // Congratulate the player and display the number of tries
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you " + tries + " guesses!");

                    //Step 12: Game Replay

                    // Ask if the player wants to play again
                    System.out.println("Would you like to play again? Yes or No: ");

                    //we check if the player wants to play again by reading their input into the play variable
                    play = reader.next().toLowerCase(); //The toLowerCase() method is used to ensure case-insensitive comparison.

                } else if (guess > randNum) {
                    // Provide feedback if the guess is too high
                    System.out.println("Your guess is too high, try again.");
                } else {
                    // Provide feedback if the guess is too low
                    System.out.println("Your guess is too low.");
                }
            }
        }

        // Step 13: Close the Scanner
        reader.close(); 
    } // Close main method
} // Close class
