public class LeapYearLogicalOperators {
    public static boolean isLeapYear(int year) {
        // Check if the year is out of the valid range
        if (year < 1 || year > 9999) {
            return false;
        }

        // Check if the year is divisible by 4 and not divisible by 100
        // OR the year is divisible by 400
        // leap
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isLeapYear(-1600)); // should return false
        System.out.println(isLeapYear(1600));  // should return true
        System.out.println(isLeapYear(2017));  // should return false
        System.out.println(isLeapYear(2000));  // should return true
    }
}



