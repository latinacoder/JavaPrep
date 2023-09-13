///////////////////////////////////CLASS MAIN//////////////////////////////////////////////


public class Main {
    public static void main(String[] args) {

        // Create a new printer with initial toner level 50 and duplex mode enabled
        Printer printer1 = new Printer(50, true);

        // Display the initial page count of the printer
        System.out.println("Initial page count = " + printer1.getPagesPrinted());

        // Print 5 pages and store the number of pages printed
        int pagesPrinted = printer1.printPages(5);

        // Display the result of the current print job and the updated total page count
        System.out.printf("Current job page: %d, Printer Total: %d %n",
                pagesPrinted, printer1.getPagesPrinted());

        // Print 10 more pages and store the number of pages printed
        pagesPrinted = printer1.printPages(10);

        // Display the result of the current print job and the updated total page count
        System.out.printf("Current job page: %d, Printer Total: %d %n",
                pagesPrinted, printer1.getPagesPrinted());
    }
}

///////////////////////////////////CLASS PRINTER//////////////////////////////////////////////
//ENCAPSULATION
public class Printer {
    // Private Fields for Encapsulation:
    private int tonerLevel;
    private int pagesPrinted; // Default is 0
    private boolean duplex;

    // Create constructor for tonerLevel and duplex
    // pagesPrinted gets left out because it is only managed by this class and not passed in when creating a new printer
    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0; // Initialize pagesPrinted to 0 when creating a new printer
        // Ensure tonerLevel is within the valid range (0 to 100) or set it to -1 if it's outside that range
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex; // Initialize the duplex mode
    }

    // Method for adding toner
    public int addToner(int tonerAmount) {
        // Calculate the new toner level after adding toner
        int tempAmount = tonerAmount + tonerLevel;
        tonerLevel += tonerAmount; // Update the toner level
        return tonerLevel; // Return the updated toner level
    }

    // Method for printing pages
    public int printPages(int pages) {
        // Calculate the number of pages to be printed based on duplex mode
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages; // Update the total pagesPrinted
        return jobPages; // Return the number of pages printed for the current request
    }

    // Add a getter to retrieve the total number of pages printed
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

