package Section6;

public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);  // should print 1 2 3 6
        printFactors(32); // should print 1 2 4 8 16 32
        printFactors(10); // should print 1 2 5 10
        printFactors(-1); // should print "Invalid Value"
    }

    // Method to print all factors of a given number.
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " "); // Print the factor if it divides the number evenly.
                }
            }
            System.out.println(); // Move to the next line after printing all factors.
        }
    }
}
