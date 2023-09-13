public class Main {
    public static void main(String[] args) {

        //new object:
        Employee joe = new Employee("Joe", "11/11/1990", "06/15/2023");
        System.out.println(joe);
        //Print Object Methods: getAge() and collectPay()
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());

        //new object for SalariedEmployee:
        SalariedEmployee jess = new SalariedEmployee("Jess", "09/15/1991", "09/15/2023", 90000);
        //Print new Object Fields:
        System.out.println(jess);
        System.out.println("Jess' bi-weekly paycheck = $ " + jess.collectPay());
        jess.retire();
        System.out.println("Jess' pension check = $" + jess.collectPay());

        //new object for HourlyEmployee:
        HourlyEmployee mary = new HourlyEmployee("Mary", "01/01/2000", "05/05/2023", 15);
        System.out.println(mary);
        //print HourlyEmployee methods:
        System.out.println("Mary's paycheck = $" +mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());


    }
}
