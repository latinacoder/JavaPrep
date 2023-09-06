// The goal of this class is to create methods that convert seconds and minutes into hours,
// and display the time in hours with the remaining minutes and seconds in the format XXh YYm ZZs.
// This transformation is done in two steps, utilizing overloaded methods.

public class SecondsAndMinutesChallenge {
    
    // Method 1: Converts seconds to hours and calls Method 2 to get the result.
    public static String getDurationString(int seconds) {

        // Check if the provided seconds is negative, and return an error message if it is.
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value.";
        }

        // Calculate the number of minutes in the provided seconds.
        int minutes = seconds / 60;

        // Call Method 2 to complete the transformation and return its result.
        return getDurationString(minutes, seconds % 60);
    }

    // Method 2: Converts minutes to hours and formats the time as XXh YYm ZZs.
    public static String getDurationString(int minutes, int seconds) {

        // Check if the provided minutes is negative, and return an error message if it is.
        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value.";
        }

        // Check if the provided seconds are not within the valid range (0 to 59).
        if (seconds < 0 || seconds >= 60) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59.";
        }

        // Calculate the number of hours in the provided minutes.
        int hours = minutes / 60;

        // Calculate the remaining minutes after converting to hours.
        int remainingMinutes = minutes % 60;

        // Format the time as XXh YYm ZZs and return the result.
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    // Main method to test the getDurationString methods with different cases.
    public static void main(String[] args) {
        System.out.println("Test 1 " + getDurationString(3945));   // Test case #1
        System.out.println("Test 2 " + getDurationString(65, 45)); // Test case #2
        System.out.println("Test 3 " + getDurationString(-3945));  // Test case #3
        System.out.println("Test 4 " + getDurationString(65, 3));   // Test case #4
    }
}
