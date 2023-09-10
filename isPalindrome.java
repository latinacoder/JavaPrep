package Section6;

public class IsPalindrome {
    public static boolean isPalindrome (int number ){
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10; // extract last digit
            reverse = (reverse * 10) + lastDigit; //build the reverse by moving decimal space to left (so 4 becomes 40 (+ lastDigit =  43))
            number = number / 10; // removes the last digit and keeps the first ones
        }
        //compare the original number with reverse to check for palindrome
        return (originalNumber == reverse) ;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1111));
    }
}
