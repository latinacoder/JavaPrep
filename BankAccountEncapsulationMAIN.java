public class BankAccountEncapsulationMAIN {

    public static void main(String[] args) {

        // testing our class and methods by creating an account object

        BankAccountEncapsulationCLASS jessAccount = new BankAccountEncapsulationCLASS();

        //setting values WITHOUT using constructors
        jessAccount.setAccountNumber("12345");
        jessAccount.setBalance(9000.00);
        jessAccount.setCustomerName("Jess");
        jessAccount.setEmail("jess@gmail.com");
        jessAccount.setPhoneNumber(2123456789);

        //testing withdrawalFunds and depositFunds methods:
        jessAccount.withdrawFunds(50.00);
        jessAccount.depositFunds(250);
        jessAccount.withdrawFunds(50.00);

    }





}
