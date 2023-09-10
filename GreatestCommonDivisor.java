package Section6;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));  // should return 5
        System.out.println(getGreatestCommonDivisor(12, 30));  // should return 6
        System.out.println(getGreatestCommonDivisor(9, 18));   // should return -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // should return 9
    }

    // Method to find the greatest common divisor of two numbers.
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1; // Check if either number is less than 10, return -1 for invalid value.
        }

        int min = Math.min(first, second); // Find the minimum of the two numbers.
        int gcd = 1; // Initialize the greatest common divisor to 1.

        // Use a for loop to iterate from 1 to the minimum of the two numbers.
        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i; // If both numbers are divisible by i, update gcd to i.
            }
        }

        return gcd; // Return the greatest common divisor.
    }
}

//Rationale:
//
//        The getGreatestCommonDivisor method takes two integers,first and second,as input and checks if either of them is less than 10.If any of them is less than 10,it returns-1to indicate an invalid value.
//        It then finds the minimum of the two numbers using Math.min(first,second)to determine the upper limit for the loop.
//        The method initializes the greatest common divisor(gcd)to 1.
//        Using a for loop,it iterates from 1to the minimum of the two numbers.
//        Inside the loop,it checks if both first and second are divisible by i(i.e.,first%i==0&&second%i==0).If they are,it updates gcd to i.
//        After the loop completes,it returns the value of gcd,which is the greatest common divisor.
