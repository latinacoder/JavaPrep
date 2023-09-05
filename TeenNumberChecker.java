public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 <= 19) && (num1 >= 13) || (num2 <= 19) && (num2 >= 13) || (num3 <= 19) && (num3 >= 13)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isTeen(int num4){
        return  ((num4 <= 19) && (num4 >= 13));
    }

    public static void main (String[]args){
        System.out.println("hasTeen test 1 " + hasTeen(9, 99, 19)); // true
        System.out.println("hasTeen test 2 " + hasTeen(23, 15, 42)); // true: 15 is in range
        System.out.println("hasTeen test 3 " + hasTeen(22, 23, 34)); // false
        System.out.println("isTeen test 1 " + isTeen(9)); // false
        System.out.println("isTeen test 2 " + isTeen(13)); // true


    }
}
