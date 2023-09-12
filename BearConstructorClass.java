public class BankAccountEncapsulationCLASS {

    //creating private fields:
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    //creating constructors. We can have multiple constructors to assign data to our fields instead of calling a bunch of setters.
    // syntax: access modifier (public) and ClassName and ()
    public BankAccountEncapsulationCLASS (){
        this("1234",10.000, "Default Name", "default email", 123456);
        System.out.println("Empty constructor called");
    }

    public BankAccountEncapsulationCLASS(String customerName, String email, int phoneNumber) {
        this("9999", 900, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public BankAccountEncapsulationCLASS (String accountNumber, double balance, String customerName, String email, int phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // creating methods: deposit and withdrawal
    public void depositFunds(double depositAmount){
        balance += depositAmount; // balance = balance + depositAmount
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount; //balance = balance - withdrawalAmount
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        } // close else
    } // close withdrawFunds method

    // getter methods to allow public access: (Menu -> Code -> Generate)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    // creating setters for each field:
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //two methods: withdrawing and depositing:
    public void withdraw(){

    }


}
