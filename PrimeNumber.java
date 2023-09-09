package Section6;

public class PrimeNumber {
    public static void main (String[]args){

        //test cases:
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number" );
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number" );
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number" );
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number" );

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number" );
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime  number" );

    } // close main method

    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        //Checking beyond this point would be redundant because any divisor greater than wholeNumber / 2 would already have been checked in the first half of the loop.

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            // Check if 'wholeNumber' is divisible by 'divisor' without any remainder
            if (wholeNumber % divisor == 0){
                return false; // If divisible, 'wholeNumber' is not prime, so return false
            }
        }

        return true;
    }
}
