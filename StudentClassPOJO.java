/*
POJO: requires a way to populate data, we can do this with a constructor

With this BoilerPlate code, we have all we need to manipulate data, setting, updating, and retrieving data
- repetitive and follows a pattern

The POJO vs The Record
- The Record (introduced in JDK 14) | AKA "plain data carriers" -- more rules!
 - replaced boilerplate of POJO, but more restrictive
 - special class that contains data, that is immutable - not meant to be altered
 - only contains fundamental methods such as constructors and accessors
 -
 */

public class StudentClass {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    // constructor that will let us populate new student objects
    public StudentClass(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    //printing out all attributes in our class using the toString() generator:

    @Override  //annotation: a type of metadata that | Method Override: special method in Java that other classes can implement
    public String toString() {
        return "StudentClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    //Getters:
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    //Setters:

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
