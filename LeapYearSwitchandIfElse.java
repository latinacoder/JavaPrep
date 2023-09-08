public class NumberOfDaysInMonth {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is within the valid range
        if (year >= 1 && year <= 9999) {
            // A year is a leap year if it's divisible by 4 but not by 100, or it's divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; // It's a leap year
            }
        }
        return false; // It's not a leap year
    }

    // Method to get the number of days in a month for a given year
    public static int getDaysInMonth(int month, int year) {
        // Check if the month or year is out of valid range
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1; // Return -1 for invalid input
        }

        // Use a switch statement to determine the number of days in the month
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Months with 31 days
            case 4: case 6: case 9: case 11:
                return 30; // Months with 30 days
            case 2:
                if (isLeapYear(year)) {
                    return 29; // February in a leap year
                } else {
                    return 28; // February in a non-leap year
                }
            default:
                return -1; // Invalid month
        }
    }

    public static void main(String[] args) {
        int year = 2020;
        int month = 2;
        System.out.println(isLeapYear(year)); // true
        System.out.println(getDaysInMonth(month, year)); // 29
    }
}
