public class BankAccountEncapsulationMAIN {

    public static void main(String[] args) {

        // testing our class and methods by creating an account object

        //Replace all Setter method calls with new constructor by calling all attributes inside the parameter for new object
        BankAccountEncapsulationCLASS jessAccount = new BankAccountEncapsulationCLASS("12345", 10000, "Jess", "jess@gmail.com", 2123456789 );


//        //setting values WITHOUT using constructors
//        jessAccount.setAccountNumber("12345");
//        jessAccount.setBalance(9000.00);
//        jessAccount.setCustomerName("Jess");
//        jessAccount.setEmail("jess@gmail.com");
//        jessAccount.setPhoneNumber(2123456789);

        //testing withdrawalFunds and depositFunds methods:
        jessAccount.withdrawFunds(50.00);
        jessAccount.depositFunds(250);
        jessAccount.withdrawFunds(50.00);

        // new object:
        BankAccountEncapsulationCLASS bearsAccount = new BankAccountEncapsulationCLASS("Bear", "bear@catmail.com", 1234);
        System.out.println("Account No: " + bearsAccount.getAccountNumber() + " Name: " + bearsAccount.getCustomerName()); //should print default account number and the name placed in this new object

    }





}
