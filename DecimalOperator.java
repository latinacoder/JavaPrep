public class DecimalOperator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        // multiply by 1000, then casts (drops decimal part) to convert to integers
       int intNum1 = (int) (num1 * 1000); // -3.1756 * 1000 (will move the decimal 3 places to right) = -3175.6 || casted: -3175  (the decimal part gets truncated)
       int intNum2 = (int) (num2 * 1000);

       //check if the integers are equal
        return intNum1 == intNum2;
} // close areEqual method
    public static void main (String[]args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // returns true
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176)); // returns false bc 3175 != 3176
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0)); // returns true bc 3000 = 3000
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123)); // returns false bc -3123 != 3123

    }


} // close class
