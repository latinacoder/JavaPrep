// goal:
// creating a method that takes time in seconds as the parameter : goal is to convert to hours
//      then transform the seconds into hours
//          next display the time in hours, with the remaining minutes and seconds - in a String
// do this transformation in 2 steps, which allows us to use overloaded methods

// create 2 methods with the same name: getDurationString
// method 1: one parameter: int seconds
// method 2: two parameters: int minutes and int seconds

// both return a String in this format: XXh YYm ZZs

// method 1 should call method 2 to return its results
public class SecondsAndMinutesChallenge {
    public static String getDurationString(int seconds){ //convert seconds to hours

        if (seconds < 0 ){
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value.";
        }
        int minutes = seconds / 60;
       return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds){ // convert minutes to hours

        if (minutes < 0 ){
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value.";
        }

        if (seconds <=  0 || seconds >= 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59.";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s" ;
    }

    public static void main (String[]args){
        System.out.println("Test 1 " + getDurationString(3945)); // Test case #1
        System.out.println("Test 2 " + getDurationString(65, 45)); // Test case #2
        System.out.println("Test 3 " + getDurationString(-3945)); // Test case #3
        System.out.println("Test 4 " + getDurationString(65,3)); // Test case #4

    }




}
