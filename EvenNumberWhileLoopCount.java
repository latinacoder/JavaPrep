package Section6;

public class EvenNumberWhile {

    // Method to check if a number is even
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true; // If the number is even, return true
        } else {
            return false; // If the number is not even, return false
        }
    }

    public static void main(String[] args) {
        // Initialize variables
        int number = 4; // Starting number for printing even numbers
        int ending = 20; // Ending number for printing even numbers

        int evenCount = 0; // Counter for even numbers
        int oddCount = 0; // Counter for odd numbers

        while (number <= ending) {
            number++; // Increment the number to the next one

            if (!isEvenNumber(number)) {
                oddCount++; // If not an even number, increase the odd count
                continue; // Continue with the while loop
            }

            System.out.println("Even number " + number); // If even number, print it
            evenCount++; // Increment the even count

            if (evenCount >= 5) {
                break; // If 5 even numbers are found, exit the loop
            }
        } // Close the while loop

        // Print the total counts of odd and even numbers
        System.out.println("Total odd numbers found: " + oddCount + " and total even numbers found: " + evenCount);

        // Testing the isEvenNumber method
        System.out.println(isEvenNumber(5));
    } // Close the main method
} // Close the class
