public class MegaBytesConverter {

    //Goal: to calculate the megabytes and REMAINING kilobytes from the kilobytes parameter
    // then Print a message in the format "XX KB = YY MB and ZZ KB"
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megabytes = kiloBytes/1024;
        int modulo = kiloBytes%1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + modulo + " KB" );

        } //close else
    } // close printMegaBytesAndKiloBytes

    public static void main (String[]args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }
} // close class
