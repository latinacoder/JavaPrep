public class SumDigits {
    /**
     * This method calculates the sum of digits in a given number.
     *
     * @param number The number for which the sum of digits is calculated.
     * @return The sum of digits.
     */
    public static int sumDigits(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative input.
        }

        int sum = 0; // Initialize the sum of digits.

        while (number > 9) {
            sum += (number % 10); // Extract the last digit using % 10.
            number = number / 10; // Remove the last digit by dividing by 10.
        }

        sum += number; // Add the remaining digit (or the only digit if < 10) to the sum.
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 1234 is " + sumDigits(1234));
        System.out.println("The sum of -125 is " + sumDigits(-125));
        System.out.println("The sum of 4 is " + sumDigits(4));
        System.out.println("The sum of 32123 is " + sumDigits(32123));
    }
}
