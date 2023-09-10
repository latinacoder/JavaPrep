package Section6;
//GOAL:
//- Create a method `isPerfectNumber` to determine if a positive integer is a perfect number.
//        -  A perfect number is one where the sum of its proper divisors (excluding itself) is equal to the number itself.
//        - Handle invalid inputs (numbers less than 1) by returning `false`.
//        - Find the proper divisors of the number and calculate their sum to check for perfection.
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));  // should return true
        System.out.println(isPerfectNumber(28)); // should return true
        System.out.println(isPerfectNumber(5));  // should return false
        System.out.println(isPerfectNumber(-1)); // should return false
    }

    // Method to check if a number is a perfect number.
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false; // Check if the number is less than 1, return false for invalid value.
        }

        int sum = 0;

        // Use a for loop to find the proper divisors and calculate their sum.
        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor; // If divisor fully divides the number, add it to the sum.
            }
        }

        // Check if the sum of proper divisors is equal to the original number.
        return sum == number;
    }
}

// RATIONALE:
//
//        The isPerfectNumber method takes an integer number as input and checks if it's less than 1. If it's less than 1, it returns false to indicate an invalid value.
//        It initializes a variable sum to 0 to keep track of the sum of proper divisors.
//        It uses a for loop to iterate from 1 to number - 1 to find the proper divisors of the given number.
//        Inside the loop, it checks if number is evenly divisible by the divisor (i.e., number % divisor == 0). If it is, then divisor is a proper divisor, and it's added to the sum.
//        After the loop, it checks if the sum of proper divisors is equal to the original number. If they are equal, it returns true, indicating that number is a perfect number; otherwise, it returns false.
