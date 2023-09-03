public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        if ((hourOfTheDay < 0) || (hourOfTheDay > 23)) {
            return false; // out of range
        } else if ( barking && (hourOfTheDay < 8) || (hourOfTheDay > 22)) {
            return true;
        } // close else if
        else {
            return false;
        } // close else

    } // close shouldWakeUp

    public static void main(String[]args){
        boolean result = shouldWakeUp(false,2);
        System.out.println(result);// returns: false
    }
} // close BarkingDog
