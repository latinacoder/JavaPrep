package Section6;

public class CounterLoop {

    public static void main(String[]args){

        //tester example
        for (int counter = 1; counter <= 5; counter ++ ){
            System.out.println(counter);
        } // close counter for loop
for (double rate = 2.0; rate <= 5.0; rate++){
    double interestAmount = calculateInterest(1000,rate);
    System.out.println("10,000 at " + rate + "% interest = $" + interestAmount);
} // close for loop

 for ( double rate2 = 7.5; rate2 <= 10.0; rate2 += 0.25 ) {
     double interestAmount2 = calculateInterest(100, rate2);
     // adding a break to break out of a loop
     if (interestAmount2 > 8.5){
         break;
     } // close break
     System.out.println("100 at " + rate2 + "% interest = $" + interestAmount2);
 };
    } // close main method

    //new method to calculate interest
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100)); //bc amount comes in as a double (ex: $200 * (5%/100) = 200 * .05 = 10). $10 is the interest accrued
    }
} // close class
