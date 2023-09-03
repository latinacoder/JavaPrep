// nested conditionals
public class LeapYear {
    public static boolean isLeapYear(int year) {
        // check if the year is out of the valid range
        if ((year < 1) || (year > 9999)){
            return false;
        } //close range check

        // check if year is divisible by 4:
        if (year % 4 == 0 ) {
            // if divisible by 4, go to step 2 (check further conditions)

            // check if year is divisible by 100
            if (year % 100 == 0) {
                // if year is divisible by 100, check if year divisible by 400
                if (year % 400 == 0) {
                    return true; //step 4: year divisible by 4, 100, and 400
                } else {
                    return false; // not a leap year: (divisible by 4 and 100, but not 400)
                } //
            } else {
                return true; // divisible by 4 but not 100
            }
        } else {
                return false; // not divisible by any of the conditionals
            } // close else

    } // close isLeapYear
    public static void main(String[]args) {
        boolean result = isLeapYear(2024);
        System.out.println(result);
    } // close main
} // close Class
