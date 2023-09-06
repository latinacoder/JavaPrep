import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner reader = new Scanner(System.in);
        // Initialize the "play" variable to "yes" to start the game
        String play = "yes";
        
        // While loop to determine if we are going to play the game again
        while (play.equals("yes")) {
            // Create a random number generator
            Random rand = new Random();
            // Generate a random number between 0 and 99 and store it in "randNum"
            int randNum = rand.nextInt(100);
            // Initialize "guess" to -1 and "tries" to 0
            int guess = -1;
            int tries = 0;
            
            // While loop to check if the game is over
            while (guess != randNum) {
                // Prompt the user to guess a number between 1 and 100
                System.out.print("Guess a number between 1 and 100: ");
                // Read the user's guess
                guess = reader.nextInt();
                // Increment the number of tries
                tries++;
                
                // Check if the guess is correct
                if (guess == randNum) {
                    // Congratulate the player and display the number of tries
                    System.out.println("Awesome! You guessed the number!");
                    System.out.println("It only took you " + tries + " guesses!");
                    // Ask if the player wants to play again
                    System.out.println("Would you like to play again? Yes or No: ");
                    play = reader.next().toLowerCase();
                } else if (guess > randNum) {
                    // Provide feedback if the guess is too high
                    System.out.println("Your guess is too high, try again.");
                } else {
                    // Provide feedback if the guess is too low
                    System.out.println("Your guess is too low.");
                }
            }
        }
        
        // Close the Scanner
        reader.close();
    } // Close main method
} // Close class
