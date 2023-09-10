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

        public static void numberToWords(int number) {
            if (number < 0) {
                System.out.println("Invalid Value");
                return;
            }

            int reversedNumber = reverse(number); // Reverse the given number
            int digitCount = getDigitCount(number); // Get the count of digits in the original number
            int reversedDigitCount = getDigitCount(reversedNumber); // Get the count of digits in the reversed number

            while (reversedNumber > 0) {
                int lastDigit = reversedNumber % 10;
                reversedNumber /= 10;

                // Print the word corresponding to the last digit
                switch (lastDigit) {
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
            }

            // Print additional zeroes if needed to match the digit count of the original number
            if (digitCount > reversedDigitCount) {
                int zeroCount = digitCount - reversedDigitCount;
                for (int i = 0; i < zeroCount; i++) {
                    System.out.println("Zero");
                }
            }
        }

        public static int reverse(int number) {
            int reversedNumber = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                reversedNumber = reversedNumber * 10 + lastDigit; // Build the reversed number
                number /= 10; // Remove the last digit
            }
            return reversedNumber;
        }

        public static int getDigitCount(int number) {
            if (number < 0) {
                return -1;
            }

            int count = 0;
            do {
                count++;
                number /= 10; // Remove the last digit
            } while (number > 0);

            return count;
        }
    }


//RATIONALE:
//- To print a number in words, we need to extract each digit and convert it to its word form.
// -We reverse the number to ensure the words are printed in the correct order.
// - Leading zeroes are added to match the digit count of the original number.
// - Negative numbers and zero are handled with appropriate messages.
