public class StudentMain {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
//            StudentClass s = new StudentClass // to create a new POJO Class object
            LPAStudent s = new LPAStudent // to create a new record object
                    ("IDNum" + i,
                                    switch (i) {
                                case 1 -> "Jess";
                                case 2 -> "Chris";
                                case 3 -> "Martha";
                                case 4 -> "Sebastian";
                                case 5 -> "Amauri";
                                default -> "Anonymous";
                                    },
                                    "09/15/1991",
                                    "Java Masterclass");
            System.out.println(s);
        } // close object

        //new POJO instance:
        StudentClass pojoStudent = new StudentClass("1234", "Jess-Pojo", "09/15/1991", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("12345", "Jess-Record", "09/15/1991", "Java Masterclass");

        //printing out the new objects
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        //GETTERS:
        //printing out the attributes using getter (pojo) and accessor (record):

        /* for POJO: use Get. Remember:
         public String getName() { return name; }
         */
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList()); // should print out Jess-Pojo , Java Masterclass

        /*for record: do not use Get because it doesn't exist. remember record:
            public record LPAStudent(String id, String name, String dateOfBirth, String classList) {}
        */
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList()); // should print out Jess-Record , Java Masterclass


        //SETTERS (can only be for POJO). Records are immutable and cannot be changed
        pojoStudent.setClassList((pojoStudent.getClassList()) + ", Setting New class list in POJO");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList()); // should print out Jess-Pojo , Java Masterclass

    }
}
