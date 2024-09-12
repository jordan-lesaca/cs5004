/**
 * Author class represents an author with a name, email and address
 */
public class Author {

    private Person person;
    private String email;
    private String address;

    /**
     * Constructor for an Author object with a person, email and address
     *
     * @param person Person object containing author's name
     * @param email email address of author
     * @param address address of author
     */
    public Author(Person person, String email, String address) {
        this.person = person;
        this.email = email;
        this.address = address;
    }

    /**
     * Method to get full name of author from Person object
     *
     * @return the full name of author
     */
    public String getName() {
        return person.getFullName();
    }

    /**
     * Method gets email address of author
     *
     * @return email of author
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method gets address of author
     *
     * @return address of author
     */
    public String getAddress() {
        return address;
    }
}