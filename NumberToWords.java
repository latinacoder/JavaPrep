package Section6;
//Goal:
//
//        Create a program that prints a given number using words for the digits.
//        Ensure the program handles negative numbers and zero properly.
//        Reverse the number to print digits in the correct order.
//        Add leading zeroes if the original number has more digits than the reversed number.
public class NumberToWords {

        public static void main(String[] args) {
            numberToWords(123);
            numberToWords(1010);
            numberToWords(1000);
            numberToWords(-12);
        }


    public static int reverse(int number) {
        int reversed = 0; // Initialize the variable to store the reversed number
        int workNumber = 0; // Initialize a temporary variable to store the last digit

        while (number != 0) { // Continue until all digits are processed
            workNumber = number % 10; // Get the last digit
            number /= 10; // Remove the last digit from the original number
            reversed += workNumber; // Add the last digit to the reversed number

            if (number != 0) {
                reversed *= 10; // Multiply by 10 to shift digits left if there are more digits to process
            }
        }
        return reversed; // Return the reversed number
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
        int numDigit = getDigitCount(number); // Get the count of digits in the original number
        int revDigit = getDigitCount(reverse(number)); // Get the count of digits in the reversed number
        int zerosToPrint = numDigit - revDigit; // Calculate the number of leading zeros to print
        number = reverse(number); // Reverse the number for word conversion
        int printNumber = 0; // Initialize a variable to store each digit

        while (number > 0) {
            printNumber = number % 10; // Get the last digit
            switch (printNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /= 10; // Remove the last digit
        }

        for (int i = 0; i < zerosToPrint; i++) {
            System.out.println("Zero"); // Print leading zeros
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }
        if (number == 0) {
            return 1; // Return 1 for zero
        }
        int digitCount = 0; // Initialize a variable to count digits
        for (int i = 0; number > 0; i++) {
            number /= 10; // Remove the last digit
            digitCount++; // Increment the digit count
        }
        return digitCount; // Return the digit count
    }





}


//RATIONALE:
//- To print a number in words, we need to extract each digit and convert it to its word form.
// -We reverse the number to ensure the words are printed in the correct order.
// - Leading zeroes are added to match the digit count of the original number.
// - Negative numbers and zero are handled with appropriate messages.
