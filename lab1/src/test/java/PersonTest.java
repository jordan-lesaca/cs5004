import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person testPerson;

    @BeforeEach
    void setUp() {
        testPerson = new Person("Jane", "Doe");
    }

    @Test
    void getFirstName(){
        assertEquals("Jane", testPerson.getFirstName());
    }

    @Test
    void getLastName(){
        assertEquals("Doe", testPerson.getLastName());
    }

    @Test
    void getFullName() {
        assertEquals("Jane Doe", testPerson.getFullName());
    }
}