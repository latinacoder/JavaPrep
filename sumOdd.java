// write a method called isOdd with an int parameter and call it number.
//the method needs to return a boolean

// check that number is > 0
//   if it is not, return false
//      if a number is odd, return true
            // otherwise, return false

// write a second method called sumOdd that has 2 int parameters start and end: which represent a range of numbers

// the method should use a [for loop to sum all odd numbers in that range], including the end ] and
//      return the sum
//   it should call the method isOdd to check if each number is odd
// the parameter end needs to be greater than or equal to start
// and both start and end parameters have to be greater than 0

        // if these conditions aren't satisfied, return -1

package Section6;

public class SumOdd {
    public static boolean isOdd(int number){

        //Step 1: check if the number is greater than 0

        if (number > 0) {
            return number % 2 != 0; // returns true for odd number
        } return false; // if number is not greater than 0, it's not odd


//
//       //alternative: long way:
//            if (number % 2 != 0) {
//                return true;
//            } else {
//                return false;
//            } // checked for odd when num greater than 0
//        } // back to range check
//        else {
//            return false; // bc number is less than 0, and therefore is out of range
//        }
    } // close isOdd


    public static int sumOdd(int start, int end){
        if (start > 0 && end >= start){

            int sum = 0;

            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i; // add the odd number to the sum
                }
            }
            return sum;
        }
        return -1;

    } // close sumOdd

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100)); // returns 2500
        System.out.println(sumOdd(-1,100)); // returns -1
        System.out.println(sumOdd(100,100)); // returns 0
        System.out.println(sumOdd(13,13)); // returns 13
        System.out.println(sumOdd(100,-100)); // returns -1
        System.out.println(sumOdd(100,1000)); // returns 247500

    }

} //  close class
