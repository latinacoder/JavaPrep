package Section6;

public class GetEvenDigitSum {
    public static int getEvenDigitSum(int number){
        // take care of negatives:

        if (number < 0){
            return -1;
        }

        // variables
        int sum = 0;

        // while loop to get the right most digit, check if its even, and if so, add to sum (we need to store even digit)

        while (number > 0){
            int digit = (number % 10); // take the rightmost digit


            if (digit % 2 == 0){
                sum += digit;
            }

            // remove that digit by /10, so number will now equal number/10
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));
    }

}
