public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if (num1 + num2 == num3){
            return true;
        } else {
            return false;
        }  
        // a simplified way to write the same thing without an if statement would be:
        
        //    return num1 + num2 == num3 
        
        //   the == operator is used for equality comparison in conditional statements 
        //  when you use the == to compare two values, it returns a boolean result.
    } // close hasEqualSum

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));

    }
} // close class
