public class SpeedConverter {

    //Goal of toMilesPerHour method is to take the input of kilometerPerHour, check if its negative, and return -1 if it is.
    // if it's not, then it should convert kilometers per hour to miles per hour using the conversion factor and then round the result using math.round
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.609; // conversion factor: 1 mile per hour = 1.609 kilometers per hour
            return Math.round(milesPerHour);
        } // close else
    } // close toMilesPerHour

    // Goal of printConversion is to call the toMilesPerHour method to calculate the miles per hour, and then print it in a formatted message as specified.
    //print the toMilesPerHour method
    // in a format: "XX km/h = YY mi/hr"
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour); //because this method converts all kilometers into miles
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main (String[] args) {
    // Test cases
        printConversion(1.5); // expected: 1.5 km/h = 1mi/h
        printConversion(10.25); // expected: 10.25km/h = 6mi/hr
        printConversion(-5.6); // expected: -5.6km/h = Invalid Value
        printConversion(25.42); // expected: 25.43 km/h = 16mi/h
        printConversion(75.114); // expected: 75.114 km/h = 47 mi/h
        printConversion(0.0); // expected: 75.114 km/h = 47 mi/h




    } // close main method
} // close SpeedConverter
