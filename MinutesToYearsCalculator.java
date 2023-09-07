public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){

        // Calculate the number of years from the given minutes.
        // 1 year = 365 days, 1 day = 24 hours, 1 hour = 60 minutes
        long years = minutes / (365 * 24 * 60);

        // Calculate the remaining minutes after removing years.
        long remainingMinutes = minutes % ((365 * 24 * 60));

        // Calculate the number of days from the remaining minutes.
        // 1 day = 24 hours, 1 hour = 60 minutes
        long days = remainingMinutes / (60 * 24); // minutes in a day

        // Check if the input minutes is valid (non-negative).
        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            // Display the result in the format "XX min = YY y and ZZ d".
            System.out.println(minutes + " min = " + years + " y and " + days + " d" );
        }
    }

    public static void main (String[] args){
        // Example usage of the printYearsAndDays method.
        printYearsAndDays(525600); // Calling the method with 525600 minutes.
    }
}
