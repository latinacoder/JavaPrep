package Section6;

public class LastDigitChecker {

        public static void main(String[] args) {
            System.out.println(hasSameLastDigit(41, 22, 71)); // should return true
            System.out.println(hasSameLastDigit(23, 32, 42)); // should return true
            System.out.println(hasSameLastDigit(9, 99, 999)); // should return false
        }

        // Method to check if at least two numbers share the same rightmost digit.
        public static boolean hasSameLastDigit(int number1, int number2, int number3) {
            // Check if any number is outside the valid range of 10 (inclusive) to 1000 (inclusive).
            if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
                return false; // If any number is outside the range, return false.
            }

            // Extract the rightmost digit of each number.
            int lastDigit1 = number1 % 10;
            int lastDigit2 = number2 % 10;
            int lastDigit3 = number3 % 10;

            // Check if at least two numbers share the same rightmost digit.
            return (lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit2 == lastDigit3);
        }

        // Method to check if a number is within the valid range of 10 (inclusive) to 1000 (inclusive).
        public static boolean isValid(int number) {
            return (number >= 10 && number <= 1000);
            // Return true if the number is within the valid range; otherwise, return false.
        }
    }

//Rationale:
//
//        In the hasSameLastDigit method, we first check if any of the input numbers is outside the valid range (10 to 1000) using the isValid method.
//        We extract the rightmost digit of each number using the modulo operator (%).
//        Then, we compare these rightmost digits to see if at least two of them are the same. If they are, we return true; otherwise, we return false.
//        The isValid method checks if a number is within the valid range and returns true if it is, or false if it's not.
