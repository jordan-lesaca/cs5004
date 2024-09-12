/**
 * Person class represents an author with a name, email and address
 */
public class Person {

    private String firstName;
    private String lastName;

    /**
     * Constructor for Person object
     *
     * @param firstName first name of person
     * @param lastName last name of person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Method gets first name of person
     *
     * @return the first name of person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method gets last name of person
     *
     * @return the last name of person
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Method gets full name of person
     *
     * @return the first and last name of person
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
