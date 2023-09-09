package Section6;
//Create a for loop using a range of numbers from 1 to 1000 inclusive;
// sum all the numbers that can be divided by both 3 and 5 ::: we need a variable for sum
// print out the numbers that have met the above conditions::: we need a variable for count
// break out of the loop once you have found 5 numbers that met the conditions above
//after breaking out of the loop, print the sum of the numbers that met the conditions above
//type all code in the main method

public class Sum3and5 {

    public static void main(String[] args) {

        int sum = 0; // Variable to store the sum of numbers that meet the conditions
        int count = 0; // Variable to count the numbers that meet the conditions

        // Loop through numbers from 1 to 1000 inclusive
        for (int i = 1; i <= 1000; i++) {
            // Check if the current number is divisible by both 3 and 5
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++; // If found a match, increment the count by one
                sum += i; // Add the matching number (value in loop variable 'i') to the sum of matches variable
                System.out.println("Found a match = " + i); // Print the number that meets the conditions
            }

            // Check if we have found 5 numbers that meet the conditions
            if (count == 5) {
                break; // If 5 matches are found, exit the loop
            }
        }

        System.out.println("Sum = " + sum); // Print the sum of numbers that meet the conditions
    }
}

