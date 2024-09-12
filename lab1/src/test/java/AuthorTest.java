import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    private Author testAuthor;

    @BeforeEach
    void setUp() {
        Person authorName = new Person("Jane", "Doe");
        testAuthor = new Author( authorName, "jane@paerson.com",
                "5th Avenue N, San Francisco, CA");
    }

    @Test
    void getName() {
        assertEquals("Jane Doe", testAuthor.getName());
    }

    @Test
    void getEmail() {
        assertEquals("jane@paerson.com", testAuthor.getEmail());
    }

    @Test
    void getAddress() {
        assertEquals("5th Avenue N, San Francisco, CA", testAuthor.getAddress());
    }
}